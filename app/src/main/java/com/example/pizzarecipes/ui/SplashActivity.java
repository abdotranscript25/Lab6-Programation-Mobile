package com.example.pizzarecipes.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzarecipes.R;

// [VOTRE NOM] - Lab 6 PizzaRecipes - Splash Screen animé

public class SplashActivity extends AppCompatActivity {

    private static final int TEMPS_AFFICHAGE = 2500; // 2.5 secondes
    private ImageView logo;
    private TextView titre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Récupérer les éléments
        logo = findViewById(R.id.logo_pizza);
        titre = findViewById(R.id.titre_splash); // À ajouter dans le XML

        // Démarrer l'animation du logo
        Animation animationLogo = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
        logo.startAnimation(animationLogo);

        // Délai avant de passer à l'activité principale
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Lancer l'activité principale (liste des pizzas)
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                // Fermer l'activité Splash (empêche de revenir en arrière)
                finish();
            }
        }, TEMPS_AFFICHAGE);
    }
}