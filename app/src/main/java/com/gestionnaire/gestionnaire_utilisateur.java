/****************************************
 Fichier :          gestionnaire_utilisateur.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Gestion des accès à la base de données pour les utilisateurs.
 Date :             2020/05/07

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
package com.gestionnaire;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.domain.utilisateur;
import com.domain.type;
import com.sqlite.SQLiteManager;

import java.util.ArrayList;

public class gestionnaire_utilisateur{

    public utilisateur gestionUtilisateur(){
        // Générer des clés pour accéder au tableau avec des INT
        new SQLiteManager().genererUtilisateur();

        // Ajouter chaque élément du tableau dans un objet
        utilisateur uti = new utilisateur(800, "JeyAdmin", "Admin", "jeyadmin@jeybox.com", 1);
        // Retourner l'objet
        return uti;
    }

}
