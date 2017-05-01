package ch01.ex;


import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = in.nextLine();

        String[] inputArray = input.split(" ");

        for (String string : inputArray) {
            System.out.println(string);
        }
    }
}
