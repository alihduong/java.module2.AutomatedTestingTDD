package AbsoluteNumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteTest {
    @Test
    @DisplayName("Testing Find Absolute Number")
    public void testFindAbsolute(){
        int number = 0;
        int expected = 0;
        int result = Absolute.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing Find Absolute Number")
    public void testFindAbsolute1(){
        int number = -1;
        int expected = 1;
        int result = Absolute.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing Find Absolute Number")
    public void testFindAbsolute2(){
        int number = 1;
        int expected = 1;
        int result = Absolute.findAbsolute(number);
        assertEquals(expected, result);
    }
}