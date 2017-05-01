package ch01.ex;


import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter integers: ");

        String line = in.nextLine();

        double[] numbers = new double[0];

        if (!"".equals(line)) {

            String[] stringNumbers = line.split(" ");

            numbers = new double[stringNumbers.length];

            for (int i = 0; i < stringNumbers.length; i++) {
                numbers[i] = Double.parseDouble(stringNumbers[i]);
            }
        }

        System.out.println(average(1, numbers));
    }

    private static double average(double first, double... values) {

        double sum = first;

        for (double d : values) {
            sum += d;
        }

        return values.length == 0 ? sum : sum / (values.length + 1);
    }
}
