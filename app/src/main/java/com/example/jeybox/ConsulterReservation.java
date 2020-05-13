/****************************************
 Fichier :          ConsulterReservation.java
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

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ConsulterReservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.consulter_reservation);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        configureBackButton();
        configureRowSelected();

    }

    private void configureRowSelected() {
        final TextView test = (TextView) findViewById(R.id.lblTest1);
        final TextView test1 = (TextView) findViewById(R.id.lblTest2);
        final TextView test2 = (TextView) findViewById(R.id.lblTest3);
        final TextView test3 = (TextView) findViewById(R.id.lblTest4);

        test.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                test.setBackgroundColor(Color.CYAN);
                test1.setBackgroundColor(Color.CYAN);
                test2.setBackgroundColor(Color.WHITE);
                test3.setBackgroundColor(Color.WHITE);
            }
        });
        test1.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view){
            test.setBackgroundColor(Color.CYAN);
            test1.setBackgroundColor(Color.CYAN);
            test2.setBackgroundColor(Color.WHITE);
            test3.setBackgroundColor(Color.WHITE);
        }
    });
        test2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                test.setBackgroundColor(Color.WHITE);
                test1.setBackgroundColor(Color.WHITE);
                test2.setBackgroundColor(Color.CYAN);
                test3.setBackgroundColor(Color.CYAN);
            }
        });
        test3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                test.setBackgroundColor(Color.WHITE);
                test1.setBackgroundColor(Color.WHITE);
                test2.setBackgroundColor(Color.CYAN);
                test3.setBackgroundColor(Color.CYAN);
            }
        });
    }

    //Navigate back to accueil
    private void configureBackButton(){
        Button backButton = (Button) findViewById(R.id.btnBack);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
    }
}
