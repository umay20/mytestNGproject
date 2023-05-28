package main.smallstudygroups.ascivaluememoryusage;

import java.util.Scanner;

public class SelfPractice04 {
    public static void main(String[] args) {


        // ask  the user to enter to write an integer, and then
        // If the integer is even, write "Even"
        // If the integer is odd, write "Odd"

        Scanner input=new Scanner(System.in);

        System.out.println("Enter an integer...");
        int number=input.nextInt();

        if(number%2==0){
            System.out.println("Even number");
        } else  {
            System.out.println("Odd number");

        }
        }


    }

