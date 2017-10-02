package calculator;

public class CalculatorPrototype implements CalculatorIF {

    public int sum(int m, int n){
        int result = m;
        while (n != 0) {
            result += 1;
            n-=1;
        }
        return result;
    }

    public int subtract(int m, int n){
        int result = m;
        while (n != 0) {
            result -= 1;
            n -= 1;
        }
        return result;
    }

    public int multiply(int m, int n){
        int result = 0;
        if (n == 0)
            return result;
        while(n > 0){
            result += m;
            n -= 1;
        }
        return result;
    }

    public int divide(int m, int n){
        if (n == 0)
            throw new ArithmeticException();
        int result = 0;
        while(m > 0){
            m -= n;
            result++;
        }
        if (m!=0){
            result-= 1;
        }
        return result;
    }
}
