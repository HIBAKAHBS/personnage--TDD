package com.hiba.FizzBuzz;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzParamTest {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20})
    void testFizzBuzzRange(int n) {
        String[] expected = {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz",
                "11","Fizz","13","14","FizzBuzz","16","17","Fizz","19","Buzz"};
        assertThat(FizzBuzz.de(n)).isEqualTo(expected[n-1]);
    }
}
