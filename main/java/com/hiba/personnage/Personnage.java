package com.hiba.personnage;

public class Personnage {
    private Orientation orientation = Orientation.NORD;
    public Orientation getOrientation() {
        return orientation;
    }
    public Orientation tourner(int fois) {
        Orientation[] orientations = Orientation.values();
        int indexInitial = orientation.ordinal();
        int nouvelIndex = (indexInitial + fois) % orientations.length;
        orientation = orientations[nouvelIndex];
        return orientation;
    }


}




