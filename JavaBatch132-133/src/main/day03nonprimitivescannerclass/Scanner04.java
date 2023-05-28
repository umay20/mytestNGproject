package main.day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        /*
   Type a program which calculates the volume of a rectangular prism
   whose length, width, and height are entered by user.
   Hint 1: Volume of a rectangular prism is width x length x height
*/

//1.Create Scanner object:
        Scanner input =new Scanner(System.in);//i created an object from Scanner class and name it input
        System.out.println("Enter the length,width and height of the rectangular prism,please.. ");
        double length=input.nextDouble();//rec pris can be decimal thats why double //right side fetch the info from user and put into left length value
        double width=input.nextDouble();
        double height=input.nextDouble();

        System.out.println("The volume is: "+width*length*height); // islem parantez icinde olmayabiliyormus carpma islemi olunca
        //yani order operation in math is same in Java in multiplication and division no need to put inside paranthesis. It is optional
    }
}
