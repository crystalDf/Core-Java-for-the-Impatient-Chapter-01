package ch01.ex;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int input = in.nextInt();

        printPascal(getPascal(input));
    }

    private static ArrayList<ArrayList<Integer>> getPascal(int n) {

        ArrayList<ArrayList<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if ((j == 0) || (j == i)) {
                    row.add(1);
                } else {
                    row.add(pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j));
                }
            }

            pascal.add(row);
        }

        return pascal;
    }

    private static void printPascal(ArrayList<ArrayList<Integer>> pascal) {

        for (ArrayList<Integer> integerArrayList : pascal) {
            for (int i : integerArrayList) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
