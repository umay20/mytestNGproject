package main.practice.day27practices;

import java.util.Scanner;

public class Q03_ForLoop_IsDigit {
    /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.

     Example:
     input : J4\/4 1$ 34$¥
     output : 16

     Hint:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");

        System.out.println(sumOfDigits(scanner.nextLine()));

    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));
                sum += Integer.parseInt(str.charAt(i) + "");
            }
        }
        return sum;
    }
}










