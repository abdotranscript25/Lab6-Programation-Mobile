package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.adapter.PizzaAdapter;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

import java.util.List;

// [VOTRE NOM] - Lab 6 PizzaRecipes - Liste des pizzas

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        // 1. Récupérer la ListView du layout
        ListView listViewPizzas = findViewById(R.id.lv_pizzas);

        // 2. Récupérer la liste des pizzas depuis le service (Singleton)
        ProduitService service = ProduitService.getInstance();
        List<Produit> listePizzas = service.trouverTous();

        // 3. Créer l'adaptateur et l'attacher à la ListView
        PizzaAdapter adaptateur = new PizzaAdapter(this, listePizzas);
        listViewPizzas.setAdapter(adaptateur);

        // 4. Gérer le clic sur une pizza (VERSION CORRIGÉE)
        listViewPizzas.setOnItemClickListener((parent, vue, position, id) -> {
            // Récupérer la pizza à la position cliquée
            Produit pizzaChoisie = listePizzas.get(position);

            // Récupérer son VRAI ID
            long vraiId = pizzaChoisie.getId();

            // Créer l'intent vers l'activité de détail
            Intent intent = new Intent(MainActivity.this, PizzaDetailActivity.class);

            // Passer le VRAI ID de la pizza sélectionnée
            intent.putExtra("pizza_id", vraiId);
            startActivity(intent);
        });
    }
}