package Triangle;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("Testcase 1")
    public void testTriangle() {
        int a = 5;
        int b = 5;
        int c = 5;
        String expect = "Tam giác đều";
        String result = Triangle.triangle(a, b, c);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Testcase 2")
    public void testTriangle1() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expect = "Tam giác Cân";
        String result = Triangle.triangle(a, b, c);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Testcase 3")
    public void testTriangle2() {
        int a = 4;
        int b = 5;
        int c = 6;
        String expect = "Tam giác thường";
        String result = Triangle.triangle(a, b, c);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Testcase 4")
    public void testTriangle3() {
        int a = 9;
        int b = 2;
        int c = 1;
        String expect = "không là Tam giác";
        String result = Triangle.triangle(a, b, c);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Testcase 5")
    public void testTriangle4() {
        int a = -1;
        int b = 2;
        int c = 1;
        String expect = "không là Tam giác";
        String result = Triangle.triangle(a, b, c);
        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Testcase6")
    void testTriangleClassifier6() {
        int a = 0;
        int b = 1;
        int c = 1;
        String expect = "Không phải tam giác";
        String result = Triangle.triangle(a, b, c);
        assertEquals(expect, result);
    }

}