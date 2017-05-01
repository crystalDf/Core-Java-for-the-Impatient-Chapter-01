package ch01.ex;


import java.util.Random;

public class Ex10 {

    public static void main(String[] args) {

        Random random = new Random();

        long a = random.nextLong();

        a = Math.floorMod(a, 36);

        System.out.println(Long.toUnsignedString(a));
    }
}
