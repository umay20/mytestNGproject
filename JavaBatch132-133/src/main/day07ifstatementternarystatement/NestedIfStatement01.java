package main.day07ifstatementternarystatement;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class NestedIfStatement01 {
    public static void main(String[] args) {
      /*
      NESTED STRUCTURES USE TOO MUCH TIME IN EXECUTION,IT MAKES THE APPLICATION SLOW THAT IS WHY WE DO NOT LIKE TO USE
      NESTED STRUCTURES,BUT SOMETIMES IT IS BEING MANDATORY TO USE THAT IS WHY WE ARE LEARNING.

      If a code has much execution time, it is called "Time consuming code". Prevent to type time-consuming codes.
       */
        //Example 1: If the worker is male and the age is greater than 65 he will be retired otherwise he should work
        //           If the worker is female and the age is greater than 60 she will be retired otherwise he should work
        //           If the worker does not define himself as male or female print "Undefined" on the console
        Scanner input = new Scanner(System.in);

        System.out.println("Enter yor gender like Male, Female, or Others");
        String gender = input.next();

        System.out.println("Enter your age...");
        byte age = input.nextByte();

        if(gender.equalsIgnoreCase("Male")){

            if(age<0){
                System.out.println("Invalid age");
            }else if(age<66){
                System.out.println("He should work...");
            }else{
                System.out.println("He should be retired");
            }

        }else if(gender.equalsIgnoreCase("Female")){

            if(age<0){
                System.out.println("Invalid age");
            }else if(age<61){
                System.out.println("She should work");
            }else{
                System.out.println("She should be retired");
            }

        }else{
            System.out.println("Undefined");
        }

        //BU SAYFADA UZUN YOL VAR DIGER SAYFADA DAHA KISA YOL AYNI SORUYA
    }
}
