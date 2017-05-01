package ch01.ex;


import java.util.ArrayList;
import java.util.Scanner;

public class Ex14 {

    private static final int CUBE_SIZE = 4;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter blank to stop: \n");

//        16 3 2 13
//        5 10 11 8
//        9 6 7 12
//        4 15 14 1

        ArrayList<String> lines = new ArrayList<>();

        while (true) {
            String line = in.nextLine();

            if ("".equals(line)) {
                break;
            }

            lines.add(line);
        }

        int[][] cube = new int[CUBE_SIZE][CUBE_SIZE];

        for (int i = 0; i < CUBE_SIZE; i++) {

            String line = lines.get(i);

            String[] numbers = line.split(" ");

            for (int j = 0; j < CUBE_SIZE; j++) {
                cube[i][j] = Integer.parseInt(numbers[j]);
            }
        }

        System.out.println(isMagicCube(cube));
    }

    private static boolean isMagicCube(int[][] cube) {

        int sum = 0;

        for (int i = 0; i < CUBE_SIZE; i++) {
            int sum_row = 0;

            for (int j = 0; j < CUBE_SIZE; j++) {
                sum_row += cube[i][j];
            }
            if (sum == 0) {
                sum = sum_row;
            } else if (sum_row != sum) {
                return false;
            }
        }

        for (int j = 0; j < CUBE_SIZE; j++) {
            int sum_col = 0;

            for (int i = 0; i < CUBE_SIZE; i++) {
                sum_col += cube[i][j];
            }
            if (sum_col != sum) {
                return false;
            }
        }

        int sum_diagonal_left = 0;
        int sum_diagonal_right = 0;

        for (int i = 0; i < CUBE_SIZE; i++) {
            sum_diagonal_left += cube[i][i];
            sum_diagonal_right += cube[i][CUBE_SIZE - 1 - i];
        }
        return !((sum_diagonal_left != sum) || (sum_diagonal_right != sum));
    }
}
