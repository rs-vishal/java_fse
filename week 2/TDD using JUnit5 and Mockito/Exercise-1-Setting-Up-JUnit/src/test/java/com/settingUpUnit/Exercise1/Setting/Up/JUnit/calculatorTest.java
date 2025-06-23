package com.settingUpUnit.Exercise1.Setting.Up.JUnit;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private  final  Calculator cal = new Calculator();
    @Test
    void testAdd() {
        int result = cal.add(2, 3);
        assertEquals(5, result);
    }
}