package main.day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Example 1: Ask user to enter width snd the length of a rectangle, then calculate
//perimeter and the area of the rectangle.(Perimeter formula 2*width+2*length)

        Scanner input=new Scanner(System.in);
        System.out.println("Enter width and length of the rectangle,please....");//iki sey istedim bu kez userdan
        double width=input.nextDouble();
        double length=input.nextDouble();
        System.out.println("perimeter: "+(2*width+2*length));
        System.out.println("Area: "+ (width * length));
    }
}
