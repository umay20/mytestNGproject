package main.day04stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    //Ex 1: Get the full name of the user and make all characters in upper cases.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first and the last name...");
        String fullName=input.nextLine().toUpperCase();
        //toUpperCase ()method converts all char to upper cases
        System.out.println(fullName);

        //Ex 2: Get the full name of the user and make all characters in upper cases, and remove spaces from the beginning
        //and from the end ex: user mistake ....Tom_Hanks.....we need to erase spaces from beginning and the end 9ORTADAKI BOSLUGU SILMIYOR
        System.out.println("Enter your first and the last name...");
        String name=input.nextLine().toUpperCase().trim();//It is called Method Chain

        //trim(0) method removes the "space" characters from the beginning and from the end
        //trim(0) method do not touch spaces in the middle
        System.out.println(name);

        //Example 3: Get a String from a user, then count the number of characters in the String
        System.out.println("Enter a String...");
        String s= input.nextLine();

        int numOfChars=s.length();
        System.out.println(numOfChars);
        //length() method gives you the number of chars in a String
        //length() method integer olarak dondugu icin method chain yapamadik integer olarak kullandik

    }
}
