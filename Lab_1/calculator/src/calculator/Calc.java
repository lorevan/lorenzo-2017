package calculator;

public class Calc
{
    public static void main(String [] args){
        CalculatorTestPrototype ctp = new CalculatorTestPrototype();
        ctp.testSum();
        ctp.testSum2();
        ctp.testSub();
        ctp.testSub2();
        ctp.testSub3();
        ctp.testMult();
        ctp.testMult2();
        ctp.testMult3();
        ctp.testMult4();
        ctp.testDivision1();
        ctp.testDivision2();
        ctp.testDivision3();
        ctp.testDivision4();
        ctp.testDivisionEven();
        ctp.testDivisionOdd();
        try {
            ctp.testDivisionByZero();
        }catch(ArithmeticException e){
            e.getStackTrace();
        }
    }
}