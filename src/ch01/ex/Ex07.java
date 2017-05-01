package ch01.ex;


import java.util.Random;

public class Ex07 {

    public static void main(String[] args) {

        Random random = new Random();

        short a = (short) random.nextInt(65536);
        short b = (short) random.nextInt(65536);

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("+ " + (a + b));
        System.out.println("- " + (a - b));
        System.out.println("* " + (a * b));
        System.out.println("/ " + (a / b));
        System.out.println("% " + (a % b));
    }
}
