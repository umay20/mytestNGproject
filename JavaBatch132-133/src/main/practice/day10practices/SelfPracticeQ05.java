package main.practice.day10practices;

import java.util.Scanner;

public class SelfPracticeQ05 {
     /*
Ask user how many fibonacci numbers he wants to see. Then type the code that prints
these fibonacci numbers.
Ex: if user enters 6 output will be 112358==>0+1=1,1+1=2,1+2=3===>>logic of fibonacci numbers.yanindaki sayiyla toplanarak gidiyor
 */
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.println("Enter a number of fibonacci numbers to see");
         int n=input.nextInt();//user 6 verdiginde bastaki 11 biz verecegiz,loop ise 4 kez tekrarlanacak ve 6 sayili bir fibonacci olacak

         int fibo1=1;
         int fibo2=1;

         System.out.print(fibo1+" ");
         System.out.print(fibo2+" ");

         for( int i=1 ;i<n-1   ;i++    ){

             int fibonacci=0;

             fibonacci=fibo1+fibo2;
             fibo1=fibo2;
             fibo2=fibonacci;
             System.out.print(fibonacci+" ");


         }

     }
}
