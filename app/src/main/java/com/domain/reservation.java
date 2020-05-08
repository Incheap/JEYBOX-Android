/****************************************
 Fichier :          reservation.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe permettant la manipulation des réservations.
 Date :             2020/05/07

 Vérification :
 Date               Nom                   Approuvé
 =========================================================


 Historique de modifications :
 Date               Nom                   Description
 =========================================================

 ****************************************/
package com.domain;

import androidx.annotation.NonNull;

public class reservation {
    private int id;
    private int user_id;
    private String article_id;
    private boolean in_progress;

    //Empty constructor
    public reservation(){

    }

    //Base constructor
    public reservation(int id, int user, String article, boolean prog){
        this.id = id;
        this.user_id = user;
        this.article_id = article;
        this.in_progress = prog;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return user_id;
    }

    public void setUser_id(int user) {
        this.user_id = user;
    }

    public String getArticleId() {
        return article_id;
    }

    public void setArticleId(String id) {
        this.article_id = id;
    }

    public boolean getProgress() {
        return in_progress;
    }

    public void setProgress(boolean prog) {
        this.in_progress = prog;
    }

    @NonNull
    @Override
    public String toString() {
        return "Article{" +
                "id = " + id +
                ", utilisateur = '" + user_id + '\'' +
                ", article = '" + article_id + '\'' +
                ", En cours = '" + in_progress + '\'' +
                '}';
    }


}
