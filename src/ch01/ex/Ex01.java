package ch01.ex;


import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int input = in.nextInt();

        System.out.println(Integer.toString(input, 2));
        System.out.println(Integer.toString(input, 8));
        System.out.println(Integer.toString(input, 16));

        System.out.println(Float.toHexString(1f / input));
    }
}
