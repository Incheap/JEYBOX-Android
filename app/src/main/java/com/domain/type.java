/****************************************
 Fichier :          type.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe permettant la manipulation des types utilisateur.
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

public class type {
    private int id;
    private String name;

    //Empty constructor
    public type(){

    }
    //Base constructor
    public type(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "Type {" +
                "id= " + id +
                ", nom ='" + name + '\'' +
                '}';
    }

}
