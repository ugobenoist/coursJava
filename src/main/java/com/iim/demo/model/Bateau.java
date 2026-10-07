package com.iim.demo.model;

public class Bateau implements VehiculeInterface{

    String type;
    String couleur;
    String nom;
    public Bateau(String type, String couleur, String nom){
        this.type = type;
        this.couleur = couleur;
        this.nom = nom;
    }

    public void deplacement(){
        //navigue
    }

    public String getNom(){
        return  this.nom;
    }
}
