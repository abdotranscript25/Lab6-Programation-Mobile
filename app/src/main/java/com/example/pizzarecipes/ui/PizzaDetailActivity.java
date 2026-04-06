package com.example.pizzarecipes.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.service.ProduitService;

// [VOTRE NOM] - Lab 6 PizzaRecipes - Détail d'une pizza

public class PizzaDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        // 1. Récupérer l'ID de la pizza passée par l'intent
        long pizzaId = getIntent().getLongExtra("pizza_id", -1);

        // 2. Chercher la pizza correspondante dans le service
        ProduitService service = ProduitService.getInstance();
        Produit pizza = service.trouverParId(pizzaId);

        // 3. Récupérer les vues
        ImageView imagePizza = findViewById(R.id.img_pizza_detail);
        TextView titrePizza = findViewById(R.id.titre_pizza_detail);
        TextView metaPizza = findViewById(R.id.meta_pizza_detail);
        TextView ingredientsPizza = findViewById(R.id.ingredients_pizza_detail);
        TextView descriptionPizza = findViewById(R.id.description_pizza_detail);
        TextView etapesPizza = findViewById(R.id.etapes_pizza_detail);

        // 4. Afficher les données de la pizza (si trouvée)
        if (pizza != null) {
            imagePizza.setImageResource(pizza.getImageRes());
            titrePizza.setText(pizza.getNom());
            metaPizza.setText("💰 " + pizza.getPrix() + " € | ⏱️ " + pizza.getDuree());
            ingredientsPizza.setText(pizza.getIngredients());
            descriptionPizza.setText(pizza.getDescription());
            etapesPizza.setText(pizza.getEtapes());
        } else {
            titrePizza.setText("❌ Pizza non trouvée !");
            metaPizza.setText("");
            ingredientsPizza.setText("Vérifiez que l'ID est correct.");
            descriptionPizza.setText("");
            etapesPizza.setText("");
        }
    }
}