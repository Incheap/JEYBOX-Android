package com.sqlite;

import android.provider.BaseColumns;
/****************************************
 Fichier :          SQLiteTables.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Création des tables pour la BD
 Date :             2020/05/08

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
public class SQLiteTables {

    private SQLiteTables() {

    }

    //Utilisateur
    public static class SQLite_Utilisateur implements BaseColumns {
        public static final String TABLE_NAME = "Utilisateur";
        public static final String[] COLUMN_NAME = {"id_utilisateur","nom_utilisateur", "mot_de_passe", "adresse_courriel"};

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                COLUMN_NAME[0] + " INT AUTO_INCREMENT PRIMARY KEY," +
                COLUMN_NAME[1] + " varchar(255)," +
                COLUMN_NAME[2] + " varchar(255)," +
                COLUMN_NAME[3] + " varchar(255);";

        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

        public static final String INSERT_INTO =
                "INSERT INTO " + TABLE_NAME + " ("+
                        COLUMN_NAME[0] +", " +
                        COLUMN_NAME[1] +", " +
                        COLUMN_NAME[2] +", " +
                        COLUMN_NAME[3] +", " +
                        "VALUES (?, Administrateur, Admin, admin@gmail.com,)";

        public static final String DELETE_ROW =
                "DELETE FROM " + TABLE_NAME + " WHERE _ID = ?";
    }

    //Articles
    public static class SQLite_Article implements BaseColumns {
        public static final String TABLE_NAME = "Article";
        public static final String[] COLUMN_NAME = {"id_article","nom_article", "reference", "categorie", "disponible"};

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                COLUMN_NAME[0] + " INT AUTO_INCREMENT PRIMARY KEY," +
                COLUMN_NAME[1] + " varchar(255)," +
                COLUMN_NAME[2] + " varchar(255)," +
                COLUMN_NAME[3] + " varchar(255)," +
                COLUMN_NAME[4] + " boolean;";


        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

        public static final String INSERT_INTO =
                "INSERT INTO " + TABLE_NAME + " ("+
                        COLUMN_NAME[0] +", " +
                        COLUMN_NAME[1] +", " +
                        COLUMN_NAME[2] +", " +
                        COLUMN_NAME[3] +", " +
                        "VALUES (?, RPI-2000, https://qaws.com, micro-ordinateur, true)";

        public static final String DELETE_ROW =
                "DELETE FROM " + TABLE_NAME + " WHERE _ID = ?";
    }

    //Reservation
    public static class SQLite_Reservation implements BaseColumns {
        public static final String TABLE_NAME = "Reservation";
        public static final String[] COLUMN_NAME = {"id_reservation","id_utilisateur", "id_article", "en_cours"};

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                COLUMN_NAME[0] + " INT AUTO_INCREMENT PRIMARY KEY," +
                COLUMN_NAME[1] + " INT," +
                COLUMN_NAME[2] + " INT," +
                COLUMN_NAME[3] + " boolean," +
                "FOREIGN KEY(id_utilisateur) REFERENCES Utilisateur(id_utilisateur))" +
                "FOREIGN KEY(id_article) REFERENCES Article(id_article))";

        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

        public static final String INSERT_INTO =
                "INSERT INTO " + TABLE_NAME + " ("+
                        COLUMN_NAME[0] +", " +
                        COLUMN_NAME[1] +", " +
                        COLUMN_NAME[2] +", " +
                        COLUMN_NAME[3] +", " +
                        "VALUES (?, 1, 1, true)";

        public static final String DELETE_ROW =
                "DELETE FROM " + TABLE_NAME + " WHERE _ID = ?";
    }

    //Type
    public static class SQLite_Type implements BaseColumns {
        public static final String TABLE_NAME = "Type";
        public static final String[] COLUMN_NAME = {"id_type","nom_type"};

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                COLUMN_NAME[0] + " INT AUTO_INCREMENT PRIMARY KEY," +
                COLUMN_NAME[1] + " varchar(255);";

        public static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

        public static final String INSERT_INTO =
                "INSERT INTO " + TABLE_NAME + " ("+
                        COLUMN_NAME[0] +", " +
                        COLUMN_NAME[1] +", " +
                        "VALUES (?, Electronique)";

        public static final String DELETE_ROW =
                "DELETE FROM " + TABLE_NAME + " WHERE _ID = ?";
    }
}
