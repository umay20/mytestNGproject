package main.day05stringmanipulations;

import java.util.Scanner;

public class day05q02 {

    /*
    Modulus Operator==>in Java % is called modulus op
    It returns
     */
    public static void main(String[] args) {
        //Ask user to enter an integer then print "Even" on the console if the number is even

        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");

        int number=input.nextInt();
        boolean checkedNum=number%2==0;
        System.out.println("Is the number even?"+checkedNum);

        Scanner input2=new Scanner(System.in);
        System.out.println("Enter a digit to check if it is an odd number");
        int checkOdd=input2.nextInt();
        System.out.println("Is the number odd?"+(checkOdd%2 !=0));//boolean yazmadan da true/false veriyor bu yontemle
        //ya da yukardaki gibi boolean containeri olustururuz



    }

}
