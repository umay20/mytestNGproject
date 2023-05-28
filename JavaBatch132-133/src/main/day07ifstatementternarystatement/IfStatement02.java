package main.day07ifstatementternarystatement;

import java.util.Scanner;

public class IfStatement02 {
    //Ex 1:Get user's age
    //    0-4==> Baby   5-12==>Kid    13-20==>Teenager    21-30==>Adult
    //    Other==>Undefined     Negative ages==>Invalid age

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age...");
        byte age = input.nextByte();

        if(age<0){
            System.out.println("Invalid age");
        }else if(age<5){
            System.out.println("Baby");
        }else if(age<13){
            System.out.println("Kid");
        }else if(age<20){
            System.out.println("Teenager");
        }else if(age<31){
            System.out.println("Adult");
        }else{
            System.out.println("Undefined");
        }
//NOTE:FLOW YUARDAN ASAGIYA GELDIGI ICIN CHECK EDILEN SEYLERI TEKRAR YAZMAYA GEREK YOK
        //AFTER FINDING TRUE, JAVA WILL NOT EXECUTE THE REST OF THE CODE OR BEFORE CODES
        //LESS THAN OR EQUAL TO YERINE SADECE LESS THAN KULLANDIK DAHA AZ TASK
    }




}
