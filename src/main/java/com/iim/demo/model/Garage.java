package com.iim.demo.model;

public class Garage {
    int totalPlaces;
    int placesDispo;

    public Garage(int totalPlaces){
        this.totalPlaces = totalPlaces;
        this.placesDispo = totalPlaces;
    }

    public int getPlaces (){
        return placesDispo;
    }

    public void seGare(VehiculeInterface vehicule){
        if (placesDispo >0) {
            this.placesDispo--;
            System.out.println("Véhicule garé");
        }
        else {
            System.out.println("plus de places dans le garage");
        }
    }
}
