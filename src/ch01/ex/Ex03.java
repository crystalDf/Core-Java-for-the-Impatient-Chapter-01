package ch01.ex;


import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter three integers: ");

        int inputA = in.nextInt();
        int inputB = in.nextInt();
        int inputC = in.nextInt();

        if (inputA > inputB) {
            if (inputA > inputC) {
                System.out.println(inputA);
            } else {
                System.out.println(inputC);
            }
        } else {
            if (inputB > inputC) {
                System.out.println(inputB);
            } else {
                System.out.println(inputC);
            }
        }

        System.out.println(Math.max(Math.max(inputA, inputB), inputC));
    }
}