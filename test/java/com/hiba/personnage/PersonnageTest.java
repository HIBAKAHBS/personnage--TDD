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


}