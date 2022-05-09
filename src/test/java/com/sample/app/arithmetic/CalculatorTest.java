package com.sample.app.arithmetic;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();

        int result = calculator.add(100, 200);

        assertEquals(result, 300);
    }

    @Test
    public void subtract() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(100, 200);

        assertEquals(result, -100);
    }

    @Test
    public void mul() {
        Calculator calculator = new Calculator();

        int result = calculator.mul(100, 200);

        assertEquals(result, 20000);
    }

}