package main.smallstudygroups.ascivaluememoryusage;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        // Question 6) ask from  user's name and surname and print the initials of his name and surname.
        //output ALi Can :The first letter of the name and surname you entered: A C


        Scanner input = new Scanner(System.in);

        System.out.println("Please  Enter Your FirstName : ");

        //char firstName= input.next().charAt(0);
        String firstName= input.next().substring(0,1);

        System.out.println("Please  Enter Your SurName : ");

        //char surName= input.next().charAt(0);
        String surName= input.next().substring(0,1);


        System.out.println("The first letter of the name and surname you entered : " +firstName+ " "+surName);



    }
}
