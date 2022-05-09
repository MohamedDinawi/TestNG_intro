package com.sample.app.arithmetic;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void add_10And20_30() {
        Calculator calculator = new Calculator();

        int result = calculator.add(100, 200);

        assertEquals(result, 300);
    }

    @Test
    public void subtract_10And20_30() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(100, 200);

        assertEquals(result, -100);
    }

    @Test
    public void mul_10And20_200() {
        Calculator calculator = new Calculator();

        int result = calculator.mul(100, 200);

        assertEquals(result, 20000);
    }

}