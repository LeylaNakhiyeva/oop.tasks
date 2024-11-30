package math;

public class MathUtils {
    public static double addition(double a, double b)
    {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if(b!=0){
            return a/b;
    }
       return a/b;
    }

    public static int factorial(int a) {
        if(a==1) return 1;
        else return factorial(a-1)*a;
        }
//    int factorial = 1;                //or this way
//        if (a >= 0) {
//        for (int i = 1; i <= a; i++) {
//            factorial *= i;
//        }}
//            return factorial;
    }
