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
    public void testSub() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sub = calculator.subtract(7,4);
        assertEquals(3, sub);
    }

    @Test
    public void testMult() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int mult = calculator.multiply(5,4);
        assertEquals(20, mult);
    }

    @Test
    public void testDivisionEven() {
        CalculatorPrototype calculator = new CalculatorPrototype();
        int sum = calculator.divide(6,3);
        assertEquals(2, sum);
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