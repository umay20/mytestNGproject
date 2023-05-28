package main.smallstudygroups.ascivaluememoryusage;

import java.util.Scanner;

public class SelfPracticeScanner05 {

    public static void main(String[] args) {
        // Question 6) ask from  user's name and surname and print the initials of his name and surname.
        //output ALi Can :The first letter of the name and surname you entered: A C


        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first name..");
        char firstName=input.next().toUpperCase().charAt(0);

        System.out.println("Enter your last name..");
        char lastName=input.next().toUpperCase().charAt(0);

        System.out.println("Your initials are:"+firstName+" "+lastName);
    }
}
