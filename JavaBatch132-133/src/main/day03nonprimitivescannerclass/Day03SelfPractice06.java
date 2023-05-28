package main.day03nonprimitivescannerclass;

import java.util.Scanner;

public class Day03SelfPractice06 {
    public static void main(String[] args){

        //Example 1: Ask user to enter his first and the last name and address then print them on the console.
        //1)I am creating a Scanner class object
        Scanner input=new Scanner(System.in);

        //2)I am giving a message to user
        System.out.println("Please enter your first and last name");

        //3)Get the data from user
        String firstAndLastName=input.nextLine();

        System.out.println("Please enter your address");
        String address=input.nextLine();



    }
}
