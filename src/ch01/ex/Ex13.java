package ch01.ex;


import java.util.Arrays;
import java.util.Random;

public class Ex13 {

    public static final int COUNT = 49;
    public static final int RESULT = 6;

    public static void main(String[] args) {

        int[] lotteryTickets = new int[COUNT];
        int[] results = new int[RESULT];

        for (int i = 0; i < lotteryTickets.length; i++) {
            lotteryTickets[i] = i + 1;
        }

        Random random = new Random();

        for (int i = 0; i < RESULT; i++) {
            int randomIndex = random.nextInt(COUNT - i);

            results[i] = lotteryTickets[randomIndex];

            for (int j = randomIndex; j < lotteryTickets.length - 1; j++) {
                lotteryTickets[j] = lotteryTickets[j + 1];
            }

            lotteryTickets = Arrays.copyOf(lotteryTickets, lotteryTickets.length - 1);
        }

        Arrays.sort(results);

        System.out.println(Arrays.toString(results));
    }
}
