package main.day08ternaryswitch;

public class Loops01 {
    public static void main(String[] args) {
        //EX 1: TYpe "Hi" 5 times on the console

        //1.Way:
        // 1 ST REASON :CODE REPETATITION,NOBODY LIKES IT
        //2ND RE:YOU MAY NEED TO TYPE 500 TIMES
        //3RD REA:TO UPDATE OR FIX IT YOUR CODE WILL BE VERY DIFFICULT
        //SUMMARY:To do repeated actions,typing repeated codes is not acceptable,bec repeated codes are not good at update,fix,type
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //1.Way:There are 4 loops in Java; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop
        //Starting Value    Condition   Increment/Decrement

        for(   int i=1   ; i<6       ;i=i+1     ){
            System.out.println("Hi!");
            //umay pls understand it
        }
    }
}
