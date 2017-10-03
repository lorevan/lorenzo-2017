package calculator;

public class CalculatorPrototype implements CalculatorIF {

    public int sum(int m, int n){
        int result = m;
        while (n != 0) {
            if (n > 0) {
                result += 1;
                n -= 1;
            }else{
                result -= 1;
                n += 1;
            }
        }
        return result;
    }

    public int subtract(int m, int n){
        int result = m;
        while (n != 0) {
            if (n > 0) {
                result -= 1;
                n -= 1;
            }else{
                result += 1;
                n += 1;
            }
        }
        return result;
    }

    public int multiply(int m, int n){
        int result = 0;
        int npos = Math.abs(n);
        if (n == 0)
            return result;
        while(npos > 0){
            result += m;
            npos -= 1;
        }

        if (n < 0)
            return -result;
        return result;
    }

    public int divide(int m, int n){
        if (n == 0)
            throw new ArithmeticException();
        int mpos = Math.abs(m);
        int result = 0;
        while(mpos > 0){
            mpos -= Math.abs(n);
            result++;
        }
        if (mpos!=0){
            result-= 1;
        }
        if ((m >= 0 && n > 0) || (m <= 0 && n < 0))
            return result;
        return -result;
    }
}
