package main.day03nonprimitivescannerclass;

import java.util.Scanner;//I told java to import Scanner class.it is in the util library so we import from there

public class Scanner01 {
    //To get data from user in Java,we use "Scanner Class"

    public static void main(String[] args) {
        //Steps to get from user
        //1)Create a Scanner Class Object

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age...");

        byte age=input.nextByte();
        System.out.println("Your age is" + " "+age);


    }
}
