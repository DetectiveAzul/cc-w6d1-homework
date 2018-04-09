import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void Add() {
        assertEquals(6, Calculator.Add(4 , 2), 0);
    }
    @Test
    public void Substract() {
        assertEquals(2, Calculator.Substract(4 , 2), 0);
    }
    @Test
    public void Multiply() {
        assertEquals(8, Calculator.Multiply(4 , 2), 0);
    }
    @Test
    public void Divide() {
        assertEquals(5, Calculator.Divide(10 , 2), 0);
    }
}
