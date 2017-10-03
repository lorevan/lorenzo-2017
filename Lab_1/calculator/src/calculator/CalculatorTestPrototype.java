package calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTestPrototype {

    @Test
    public void testSum() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,3);
        assertEquals(6, sum);
    }

    @Test
    public void testSum2() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.sum(3,-5);
        assertEquals(-2, sum);
    }

    @Test
    public void testSub() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(7,4);
        assertEquals(3, sub);
    }

    @Test
    public void testSub2() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(7,-4);
        assertEquals(11, sub);
    }

    @Test
    public void testSub3() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(-9,-4);
        assertEquals(-5, sub);
    }

    @Test
    public void testMult() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult = calculator.multiply(5,4);
        assertEquals(20, mult);
    }

    @Test
    public void testMult2() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult = calculator.multiply(-5,3);
        assertEquals(-15, mult);
    }

    @Test
    public void testMult3() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult = calculator.multiply(5,-2);
        assertEquals(-10, mult);
    }

    @Test
    public void testMult4() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult = calculator.multiply(-5,-5);
        assertEquals(25, mult);
    }

    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
    }

    @Test
    public void testDivision1() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(7,-2);
        assertEquals(-3, sum);
    }

    @Test
    public void testDivision2() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(-6,2);
        assertEquals(-3, sum);
    }

    @Test
    public void testDivision3() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(0,2);
        assertEquals(0, sum);
    }

    @Test
    public void testDivision4() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(-17,-4);
        assertEquals(4, sum);
    }

    @Test
    public void testDivisionOdd() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(7,3);
        assertEquals(2, sum);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(3,0);
    }

}