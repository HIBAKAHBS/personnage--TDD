package FizzBuzz.com.hiba;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void testFizzBuzzBaseCases() {
        assertEquals("1", FizzBuzz.de(1));      // cas normal
        assertEquals("2", FizzBuzz.de(2));      // cas normal
        assertEquals("Fizz", FizzBuzz.de(3));   // multiple de 3
        assertEquals("4", FizzBuzz.de(4));      // demandé
        assertEquals("Buzz", FizzBuzz.de(5));   // multiple de 5
        assertEquals("Fizz", FizzBuzz.de(6));   // demandé (3)
        assertEquals("Fizz", FizzBuzz.de(9));   // demandé (3)
        assertEquals("Buzz", FizzBuzz.de(10));  // demandé (5)
        assertEquals("FizzBuzz", FizzBuzz.de(15)); // 3 et 5
    }
}
