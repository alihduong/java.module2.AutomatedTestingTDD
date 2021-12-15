package nextDays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Test day normal")
    public void testNextDay01(){
        int day = 10;
        int month = 5;
        int year = 2000;
        String expect = "11/5/2000";

        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    @DisplayName("Test day January")
    public void testNextDay02(){
        int day = 31;
        int month = 1;
        int year = 2000;
        String expect = "1/2/2000";

        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }

    @Test
    @DisplayName("Test day February")
    public void testNextDay03(){
        int day = 28;
        int month = 2;
        int year = 2000;
        String expect = "29/2/2000";

        String result = NextDayCalculator.nextDayCalculator(day,month,year);
        assertEquals(expect,result);
    }
}