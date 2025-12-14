package com.hiba.personnage;

public class Personnage {
    private Orientation orientation = Orientation.NORD;
    public Orientation getOrientation() {
        return orientation;
    }
    public Orientation tourner(int fois) {
        return Orientation.EST;
    }

}




