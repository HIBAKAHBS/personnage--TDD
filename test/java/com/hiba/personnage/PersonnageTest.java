package com.hiba.personnage;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PersonnageTest {
    @Test
void orientation_initiale_est_nord() {
    Personnage p = new Personnage();
    assertEquals(Orientation.NORD, p.getOrientation());
}
    @Test
    void tourner_une_fois_depuis_nord_retourne_est() {
        Personnage p = new Personnage();
        Orientation result = p.tourner(1);
        assertEquals(Orientation.EST, result);
    }
    @Test
    void tourner_deux_fois_depuis_nord_retourne_sud() {
        Personnage p = new Personnage();
        Orientation result = p.tourner(2);
        assertEquals(Orientation.SUD, result);
    }
    @Test
    void tourner_zero_fois_ne_change_pas_orientation() {
        Personnage p = new Personnage();
        Orientation result = p.tourner(0);
        assertEquals(Orientation.NORD, result);
    }



}