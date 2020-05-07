/****************************************
 Fichier :          ForgotPassword.java
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

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
    }

}
