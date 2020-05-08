package com.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper{
    private static final int DATABASE_VERSION = 10;
    public static final String DATABASE_NAME = "inventaire_jeybox";

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        CREATE_ALL(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        RECREATE_ALL(sqLiteDatabase);
    }

    public static void CREATE_ALL(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Article.CREATE_TABLE);
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Reservation.CREATE_TABLE);
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Type.CREATE_TABLE);
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Utilisateur.CREATE_TABLE);
    }

    public static void DROP_ALL(SQLiteDatabase sqLiteDatabase){
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Article.DROP_TABLE);
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Reservation.DROP_TABLE);
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Type.DROP_TABLE);
        sqLiteDatabase.execSQL(SQLiteTables.SQLite_Utilisateur.DROP_TABLE);
    }

    public static void RECREATE_ALL(SQLiteDatabase sqLiteDatabase){
        DROP_ALL(sqLiteDatabase);
        CREATE_ALL(sqLiteDatabase);
    }
}
