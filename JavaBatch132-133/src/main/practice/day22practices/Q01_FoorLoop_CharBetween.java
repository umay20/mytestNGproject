package main.practice.day22practices;

import java.util.Scanner;

public class Q01_FoorLoop_CharBetween {

            //Ask user to enter 2 chars and print on console the chars between them.
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter first char");
                char char1 = scanner.next().charAt(0);
                System.out.println("Enter second char");
                char char2 = scanner.next().charAt(0);

                int ch1 = Math.min(char1, char2);
                int ch2 = Math.max(char1, char2);

                for (int i = ch1; i <= ch2; i++) {
                    System.out.print((char) i + " ");
                }
            }}

