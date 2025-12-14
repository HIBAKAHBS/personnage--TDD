package com.hiba;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testFizzBuzzBaseCases() {
        assertEquals("1", FizzBuzz.de(1));
        assertEquals("2", FizzBuzz.de(2));
        assertEquals("Fizz", FizzBuzz.de(3));
        assertEquals("4", FizzBuzz.de(4));
        assertEquals("Buzz", FizzBuzz.de(5));
        assertEquals("Fizz", FizzBuzz.de(6));
        assertEquals("Fizz", FizzBuzz.de(9));
        assertEquals("Buzz", FizzBuzz.de(10));
        assertEquals("FizzBuzz", FizzBuzz.de(15)); 
    }
}
