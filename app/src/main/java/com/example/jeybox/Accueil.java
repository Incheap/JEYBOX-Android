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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        configureConsulterRes();
        configureConsulterArticles();
        configureModifierRes();
    }

    //Création de la barre de menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    //Opérations du menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.logOut:
                Intent intent1 = new Intent(this, Login.class);
                this.startActivity(intent1);
                return true;
            case R.id.backAccueil:
                Intent intent2 = new Intent(this, Accueil.class);
                this.startActivity(intent2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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

    //  Navigation vers consulter_reservation
    private void configureConsulterArticles(){
        Button nextButton = (Button) findViewById(R.id.btnArticles);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Accueil.this, ConsulterArticle.class));
            }
        });
    }

    //  Navigation vers ajouter_reservation
    private void configureModifierRes(){
        Button nextButton = (Button) findViewById(R.id.btnReservation2);
        nextButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Accueil.this, AjouterReservation.class));
            }
        });
    }


}
