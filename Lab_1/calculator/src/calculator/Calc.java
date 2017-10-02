package calculator;

public class Calc
{
    public static void main(String [] args){
        CalculatorTestPrototype ctp = new CalculatorTestPrototype();
        ctp.testSum();
        ctp.testSub();
        ctp.testMult();
        ctp.testDivisionEven();
        ctp.testDivisionOdd();
        try {
            ctp.testDivisionByZero();
        }catch(ArithmeticException e){
            e.getStackTrace();
        }
    }
}