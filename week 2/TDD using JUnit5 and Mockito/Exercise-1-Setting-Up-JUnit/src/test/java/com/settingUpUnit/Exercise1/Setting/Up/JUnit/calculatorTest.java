package com.settingUpUnit.Exercise1.Setting.Up.JUnit;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private  final  Calculator cal = new Calculator();

    @Test
    void testAdd() {
        int result = cal.add(2, 3);
        assertEquals(5, result);    
        assertNotEquals(3, result);
    }

    @Test
    void testSubtract() {
        int result = cal.subtract(5, 3);
        assertEquals(2, result);
        assertNotEquals(3, result);
    }

    @Test
    void testMultiply() {
        int result = cal.multiply(2, 3);
        assertEquals(6, result);
        assertNotEquals(5, result);
    }

    @Test
    void testDivide() {
        int result = cal.divide(6, 3);
        assertEquals(2, result);
        assertNotEquals(3, result);
    }

}