/****************************************
 Fichier :          gestionnaire_article.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Gestion des accès à la base de données pour les articles.
 Date :             2020/05/07

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
package com.gestionnaire;

import com.domain.article;
import com.sqlite.SQLiteManager;

import java.util.ArrayList;

public class gestionnaire_article {

    public article gestionArticle(){
        // Générer des clés pour accéder au tableau avec des INT
       new SQLiteManager().genererArticle();

        // Ajouter chaque élément du tableau dans un objet
       article art = new article("001-DSM", "Cable HDMI", "CRBP-11", 3, true );
        // Retourner l'objet
        return art;
    }
}
