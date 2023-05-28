package main.day10forloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        //Example 1: Type code to find the sum of the "unique digits" in an Integer
        //           123214 ==> 3+4=7
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        String num = input.next();

        int sumOfUniques = 0;

        for(int i=0; i<num.length(); i++){

            String ch = num.substring(i, i+1);

            if(num.indexOf(ch)==num.lastIndexOf(ch)){
                sumOfUniques = sumOfUniques + Integer.valueOf(ch);

                //NOTE;IF YOU PUT "CHAR" DT INSIDE THE VALUEOF() METHOD,IT GIVES YOU THE ASCII VALUE OF THE CHAR
                //IF YOU USE "NON-DIGIT" CHARACTERS IN VALUEOF () ,IT GIVES ERROR
            }
        }
        System.out.println(sumOfUniques);


    }
}
