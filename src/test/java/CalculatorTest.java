import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void Add() {
        assertEquals(6, Calculator.add(4 , 2), 0);
    }
    @Test
    public void Substract() {
        assertEquals(2, Calculator.substract(4 , 2), 0);
    }
    @Test
    public void Multiply() {
        assertEquals(8, Calculator.multiply(4 , 2), 0);
    }
    @Test
    public void Divide() {
        assertEquals(5, Calculator.divide(10 , 2), 0);
    }
}
