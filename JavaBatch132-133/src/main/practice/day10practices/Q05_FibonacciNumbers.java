package main.practice.day10practices;

import java.util.Scanner;

public class Q05_FibonacciNumbers {
    public static void main(String[] args) {
        /*
Ask user how many fibonacci numbers he wants to see. Then type the code that prints
these fibonacci numbers.
Ex: if user enters 6 output will be 112358==>0+1=1,1+1=2,1+2=3===>>logic of fibonacci numbers.yanindaki sayiyla toplanarak gidiyor
 */

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of fibonacci numbers to see");

        int n=input.nextInt();

        int fibo1= 1; //6==>11____==it should be like this and start with one(s)
        int fibo2=1;

        int fibonacci= 0;

        System.out.print(fibo1+ " ");

        System.out.print(fibo2+ " ");

        for(int i=1; i<n-1; i++){ //condition:verilen sayidan bir cikarilip < oluyor.Ex:6 is given number ise condition i<5

            fibonacci= fibo1+fibo2;

            fibo1=fibo2;

            fibo2=fibonacci;

            System.out.print(fibonacci+ " ");

//Notes: baslangicta fibo1 and fibo2=1 olarak assign yapildi o yuzden kodun basinda yazildi.
            //her asamada fibolarin degeri ve de fibonacci degeri degisiyor asagiya dogru indikce
        }}

}
