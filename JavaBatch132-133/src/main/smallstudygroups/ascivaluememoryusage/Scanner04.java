package main.smallstudygroups.ascivaluememoryusage;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        // ask  the user to enter to write an integer, and then
        // If the integer is even, write "Even"
        // If the integer is odd, write "Odd"

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer....");

        int num= input.nextInt();

        if (num%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number" + "");
        }

// 2nd way with Ternary Operator
        Scanner input1 = new Scanner(System.in);
        System.out.println("enter an integer");
        int a=  input1.nextInt();
        String result = a%2==0 ? "even " : "odd";
        System.out.println(result);

    }
}
