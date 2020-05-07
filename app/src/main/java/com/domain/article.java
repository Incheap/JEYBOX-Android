/****************************************
 Fichier :          article.java
 Auteur :           Jérôme Nadeau
 Fonctionnalité :   Classe permettant la manipulation des articles.
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

public class article {
    private String id;
    private String name;
    private String reference;   //Ref to image or youtube video
    private int category;
    private boolean available;

    //Empty constructor
    public article(){
    }

    //Base constructor
    public article(String id, String name, String reference, int category, boolean av){
        this.id = id;
        this.name = name;
        this.reference = reference;
        this.category = category;
        this.available =av;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String ref) {
        this.reference = ref;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int cat) {
        this.category = cat;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean av) {
        this.available = av;
    }

    @NonNull
    @Override
    public String toString() {
        return "Article{" +
                "id = " + id +
                ", nom = '" + name + '\'' +
                ", reference = '" + reference + '\'' +
                ", catégorie = '" + category + '\'' +
                ", disponible = '" + available + '\'' +
                '}';
    }



}
