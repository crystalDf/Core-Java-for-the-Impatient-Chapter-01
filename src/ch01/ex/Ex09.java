package ch01.ex;


public class Ex09 {

    public static void main(String[] args) {

        String a = new String("World");
        String b = new String("World");

        System.out.println("equals " + a.equals(b));
        System.out.println("== " + (a == b));
    }
}
