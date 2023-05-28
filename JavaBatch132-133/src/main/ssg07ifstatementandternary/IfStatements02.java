package main.ssg07ifstatementandternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        // Question 1) Ask the user for an integer // and print whether the number is odd or even
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter an Integer number");
        int num= scan.nextInt();

        if(num%2==0)
            System.out.println("Even");
        if(num%2!=0){
            System.out.println("Odd");
        }

         String str=num%2==0?"Even":"Odd";

    }
}
