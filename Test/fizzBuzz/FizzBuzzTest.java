package fizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Testcase 1")
    void testFizzBuzz1(){
        String number = "123";
        String expected = "Wrong!!!";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testcase 2")
    void testFizzBuzz2(){
        String number = "253";
        String expected = "Wrong!!!";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testcase 3")
    void testFizzBuzz3(){
        String number = "35";
        String expected = "Buzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testcase 4")
    void testFizzBuzz4(){
        String number = "75";
        String expected = "FizzBuzz";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testcase 5")
    void testFizzBuzz5(){
        String number = "734255";
        String expected = "Wrong!!!";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }


}