package com.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import android.widget.Toast;

import com.domain.article;
import com.domain.reservation;
import com.domain.type;
import com.domain.utilisateur;

import java.util.ArrayList;

public class SQLiteManager {
    private SQLiteDatabase myDatabase;
    private Cursor myDataSet;

    private ArrayList<article> arrayArticle;
    private ArrayList<reservation> arrayReservation;
    private ArrayList<type> arrayType;
    private ArrayList<utilisateur> arrayUtilisateur;

    private void initDatabase(Context context){
        try {
            myDatabase = new SQLiteHelper(context).getWritableDatabase();
        } catch (Exception e) {
            Toast.makeText(context, "An error occurred.", Toast.LENGTH_LONG).show();
            Log.d("PartieMainActivity", "initDatabase() returned: " + e.getMessage());

            arrayArticle = new ArrayList<>();
            arrayReservation = new ArrayList<>();
            arrayType = new ArrayList<>();
            arrayUtilisateur = new ArrayList<>();

            reloadArrays();
        }
    }

    public void recreateDatabase(){
        SQLiteHelper.RECREATE_ALL(myDatabase);
        reloadArrays();
    }

    public void generateDefinedData(){
        genererArticle();
        genererReservation();
        genererType();
        genererUtilisateur();
    }

    public void reloadArrays(){
        reloadArrayArticle();
        reloadArrayReservation();
        reloadArrayType();
        reloadArrayUtilisateur();
    }

    private boolean reloadArrayArticle(){

        myDataSet = myDatabase.rawQuery("SELECT * FROM " + SQLiteTables.SQLite_Article.TABLE_NAME , null);

        if (!arrayArticle.isEmpty()){
            arrayArticle.clear();
        }

        if (myDataSet.moveToFirst())
            do {
                arrayArticle.add(new article(
                        myDataSet.getString(0),
                        myDataSet.getString(1),
                        myDataSet.getString(2),
                        myDataSet.getInt(3),
                true));
            } while(myDataSet.moveToNext());
        return true;
    }

    private boolean reloadArrayReservation(){

        myDataSet = myDatabase.rawQuery("SELECT * FROM " + SQLiteTables.SQLite_Reservation.TABLE_NAME + ";", null);

        if (!arrayReservation.isEmpty()){
            arrayReservation.clear();
        }

        if (myDataSet.moveToFirst())
            do {
                arrayReservation.add(new reservation(
                        myDataSet.getInt(0),
                        myDataSet.getInt(1),
                        myDataSet.getString(2),
                        true));
            } while(myDataSet.moveToNext());
        return true;
    }

    private boolean reloadArrayType(){

        myDataSet = myDatabase.rawQuery("SELECT * FROM " + SQLiteTables.SQLite_Type.TABLE_NAME + ";", null);

        if (!arrayType.isEmpty()){
            arrayType.clear();
        }

        if (myDataSet.moveToFirst())
            do {
                arrayType.add(new type(
                        myDataSet.getInt(0),
                        myDataSet.getString(1)));
            } while(myDataSet.moveToNext());
        return true;
    }

    private boolean reloadArrayUtilisateur(){

        myDataSet = myDatabase.rawQuery("SELECT * FROM " + SQLiteTables.SQLite_Utilisateur.TABLE_NAME + ";", null);

        if (!arrayUtilisateur.isEmpty()){
            arrayUtilisateur.clear();
        }

        if (myDataSet.moveToFirst())
            do {
                arrayUtilisateur.add(new utilisateur(
                        myDataSet.getInt(0),
                        myDataSet.getString(1),
                        myDataSet.getString(2),
                        myDataSet.getString(3),
                        myDataSet.getInt(4)));
            } while(myDataSet.moveToNext());
        return true;
    }

    public void genererArticle(){
        ArrayList<article> arrayArticle = new ArrayList<>();
        arrayArticle.add(new article("ADM-10110", "Cable HDMI", "Ref1", 4, true));

        for (article article:arrayArticle
        ) {
            insererArticle(article);
        }
    }

    public void insererArticle(article art){

        ContentValues insertValues = new ContentValues();
        insertValues.put(SQLiteTables.SQLite_Article.COLUMN_NAME[0], art.getId());
        insertValues.put(SQLiteTables.SQLite_Article.COLUMN_NAME[1], art.getName());
        insertValues.put(SQLiteTables.SQLite_Article.COLUMN_NAME[2], art.getReference());
        insertValues.put(SQLiteTables.SQLite_Article.COLUMN_NAME[3], art.getCategory());
        insertValues.put(SQLiteTables.SQLite_Article.COLUMN_NAME[4], art.getAvailable());

        myDatabase.insert(SQLiteTables.SQLite_Article.TABLE_NAME, null, insertValues);
    }


    public void genererReservation(){
        ArrayList<reservation> arrayReservation = new ArrayList<>();
        arrayReservation.add(new reservation(1, 233,  "ADM-10110", true));

        for (reservation reservation:arrayReservation
        ) {
            insererReservation(reservation);
        }
    }
    public void insererReservation(reservation res){

        ContentValues insertValues = new ContentValues();
        insertValues.put(SQLiteTables.SQLite_Reservation.COLUMN_NAME[0], res.getId());
        insertValues.put(SQLiteTables.SQLite_Reservation.COLUMN_NAME[1], res.getUserId());
        insertValues.put(SQLiteTables.SQLite_Reservation.COLUMN_NAME[2], res.getArticleId());
        insertValues.put(SQLiteTables.SQLite_Reservation.COLUMN_NAME[3], res.getProgress());

        myDatabase.insert(SQLiteTables.SQLite_Reservation.TABLE_NAME, null, insertValues);
    }

    public void genererType(){
        ArrayList<type> arrayType = new ArrayList<>();
        arrayType.add(new type(1,  "Cable"));

        for (type type:arrayType
        ) {
            insererType(type);
        }
    }
    public void insererType(type ty){

        ContentValues insertValues = new ContentValues();
        insertValues.put(SQLiteTables.SQLite_Type.COLUMN_NAME[0], ty.getId());
        insertValues.put(SQLiteTables.SQLite_Type.COLUMN_NAME[1], ty.getName());

        myDatabase.insert(SQLiteTables.SQLite_Type.TABLE_NAME, null, insertValues);
    }

    public void genererUtilisateur(){
        ArrayList<utilisateur> arrayUtilisateur = new ArrayList<>();
        arrayUtilisateur.add(new utilisateur(800, "JeyAdmin", "Admin", "jeyadmin@jeybox.com", 1));

        for (utilisateur utilisateur:arrayUtilisateur
        ) {
            insererUtilisateur(utilisateur);
        }
    }
    public void insererUtilisateur(utilisateur uti){

        ContentValues insertValues = new ContentValues();
        insertValues.put(SQLiteTables.SQLite_Utilisateur.COLUMN_NAME[0], uti.getId());
        insertValues.put(SQLiteTables.SQLite_Utilisateur.COLUMN_NAME[1], uti.getUserName());
        insertValues.put(SQLiteTables.SQLite_Utilisateur.COLUMN_NAME[1], uti.getPassword());
        insertValues.put(SQLiteTables.SQLite_Utilisateur.COLUMN_NAME[1], uti.getUserMail());
        insertValues.put(SQLiteTables.SQLite_Utilisateur.COLUMN_NAME[1], uti.getType());

        myDatabase.insert(SQLiteTables.SQLite_Utilisateur.TABLE_NAME, null, insertValues);
    }

    public void closeDB(){
        myDatabase.close();
    }
}
