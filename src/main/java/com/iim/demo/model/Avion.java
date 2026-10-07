package com.iim.demo.model;

public class Avion implements VehiculeInterface{

    String modele;

    public Avion(String modele){
        this.modele = modele;
    }

    public void deplacement(){
        //vole
    }
    public void atteriSurBateau (Bateau bateau){
        System.out.println("atteri sur bateau : " + bateau.getNom());
    }
}