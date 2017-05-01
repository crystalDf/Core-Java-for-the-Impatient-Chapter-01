package ch01.ex;


import java.math.BigInteger;

public class Ex06 {

    public static void main(String[] args) {

        System.out.println(calculateFactorial(1000));
    }

    private static BigInteger calculateFactorial(int n) {

        if (n <= 1) {
            return BigInteger.valueOf(n);
        } else {
            return BigInteger.valueOf(n).multiply(calculateFactorial(n - 1));
        }
    }
}
