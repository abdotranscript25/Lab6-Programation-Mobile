package com.example.pizzarecipes.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.pizzarecipes.R;
import com.example.pizzarecipes.classes.Produit;

import java.util.List;

// [VOTRE NOM] - Lab 6 PizzaRecipes - Adaptateur pour la liste des pizzas

public class PizzaAdapter extends ArrayAdapter<Produit> {

    private Context context;
    private List<Produit> listePizzas;
    private LayoutInflater inflater;

    public PizzaAdapter(@NonNull Context context, @NonNull List<Produit> listePizzas) {
        super(context, 0, listePizzas);
        this.context = context;
        this.listePizzas = listePizzas;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View vueItem = convertView;
        if (vueItem == null) {
            vueItem = inflater.inflate(R.layout.row_pizza, parent, false);
        }

        // Récupérer la pizza à la position actuelle
        Produit pizzaCourante = listePizzas.get(position);

        // Récupérer les éléments graphiques
        ImageView imagePizza = vueItem.findViewById(R.id.img_pizza);
        TextView textNom = vueItem.findViewById(R.id.tv_nom_pizza);
        TextView textMeta = vueItem.findViewById(R.id.tv_meta_pizza);

        // Remplir les éléments avec les données de la pizza
        if (pizzaCourante.getImageRes() != 0) {
            imagePizza.setImageResource(pizzaCourante.getImageRes());
        } else {
            imagePizza.setImageResource(R.mipmap.pizza1); // image par défaut
        }

        textNom.setText(pizzaCourante.getNom());
        textMeta.setText("💰 " + pizzaCourante.getPrix() + " € | ⏱️ " + pizzaCourante.getDuree());

        return vueItem;
    }
}