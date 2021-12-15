package SimpleCalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Testing addition 1+2")
    public void testAdd() {
        int first = 1;
        int second = 2;
        int expected = 3;
        int result = Calculator.addition(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction 5 - 3")
    public void testSubtraction() {
        int first = 5;
        int second = 3;
        int expected = 2;
        int result = Calculator.subtraction(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication 5 * 3")
    public void testMultiplication(){
        int first = 5;
        int second = 3;
        int expected = 15;
        int result = Calculator.multiplication(first, second);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division 25 / 5")
    public void testDivision(){
        int first = 25;
        int second = 5;
        int expected = 5;
        int result = Calculator.division(first, second);
        assertEquals(expected, result);
    }
}