/****************************************
 Fichier :          Accueil.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe lié à un UI qui contrôle les réactions de celle-ci.
 Date :             2020/05/06

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
package com.example.jeybox;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        configureConsulterRes();
    }

//  Navigation vers consulter_reservation
    private void configureConsulterRes(){
        Button nextButton = (Button) findViewById(R.id.btnReservation1);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Accueil.this, ConsulterReservation.class));
            }
        });
    }


}
