package com.sqlite;

import android.provider.BaseColumns;

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
                COLUMN_NAME[3] + " varchar(255),";

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
    public static class SQLite_Utilisateur implements BaseColumns {
        public static final String TABLE_NAME = "Article";
        public static final String[] COLUMN_NAME = {"id_article","nom_article", "reference", "categorie"};

        public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                COLUMN_NAME[0] + " INT AUTO_INCREMENT PRIMARY KEY," +
                COLUMN_NAME[1] + " varchar(255)," +
                COLUMN_NAME[2] + " varchar(255)," +
                COLUMN_NAME[3] + " varchar(255),";

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


}
