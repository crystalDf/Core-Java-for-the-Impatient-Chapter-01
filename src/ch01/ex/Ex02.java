package ch01.ex;


import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int input = in.nextInt();

        System.out.println("% " + input % 360 + "°");
        System.out.println("floorMod " + Math.floorMod(input, 360) + "°");
    }
}
