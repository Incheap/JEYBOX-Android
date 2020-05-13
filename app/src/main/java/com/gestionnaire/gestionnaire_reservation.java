/****************************************
 Fichier :          gestionnaire_reservation.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Gestion des accès à la base de données pour les réservations.
 Date :             2020/05/07

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
package com.gestionnaire;

import com.domain.reservation;
import com.sqlite.SQLiteManager;

public class gestionnaire_reservation {

    public reservation gestionReservation(){
        // Générer des clés pour accéder au tableau avec des INT
        new SQLiteManager().genererReservation();

        // Ajouter chaque élément du tableau dans un objet
        reservation res = new reservation(1, 233,  "ADM-10110", true );
        // Retourner l'objet
        return res;
    }
}
