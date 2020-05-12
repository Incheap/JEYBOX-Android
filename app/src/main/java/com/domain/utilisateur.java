/****************************************
 Fichier :          utilisateur.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe permettant la manipulation des utilisateurs.
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

public class utilisateur {
    private int id;
    private String name;
    private String password;
    private String mail;
    private int type;

    //Empty constructor
    public utilisateur()
    {}
    //Base constructor
    public utilisateur(int id, String name, String password, String mail, int type){
        this.id = id;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getUserMail(){
        return mail;
    }

    public void setUserMail(String mail){
        this.mail = mail;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @NonNull
    @Override
    public String toString() {
        return "Utilisateur{" +
                "id= " + id +
                ", motDePasse='" + password + '\'' +
                ", adresseCourriel='" + mail + '\'' +
                ", idTypePersonnel=" + type +
                '}';
    }
}
