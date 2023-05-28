package main.practice.day27practices;

public class Q01_Recursive_PrintFrom100To1 {
    // Create a method that prints numbers from 100 to 1 without using loops and numbers.
    public static void main(String[] args) {

        printNumbers('d');

    }

    public static void printNumbers(char ch) {
        if (ch >= 'a' / 'a') {
            System.out.print((int) ch + " ");
            ch--;
            printNumbers(ch);
        }
    }
}