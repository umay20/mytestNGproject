package main.practice.day10practices;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
          /*
           If the gender is "Male" and the age is less than 13 print "Boy" otherwise print "Man".
           (There is 2 condition here, thats why we used nested if)
        If the gender is "Female" and the age is less than 13 print "Girl" otherwise print "Woman".
        If the gender is different from "Male" and "Female" print "No information".
        If you put another statement into an if statement you need to use 'nested if'
        //to prevent any difference cause any problem with the enterance of the data
         */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your gender...");
        String gender= input.next().toLowerCase();

        System.out.println("Enter your age...");
        byte age= input.nextByte();

        if(gender.equals("male")){

            if(age<13){
                System.out.println("Boy");
            }else {
                System.out.println("Man");
            }


        }else if (gender.equals("female")){

            if (age<13){
                System.out.println("Girl");
            }else {
                System.out.println("Woman");
            }

        }else{
            System.out.println("No information");
        }



    }
}
