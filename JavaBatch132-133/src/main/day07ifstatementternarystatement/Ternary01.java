package main.day07ifstatementternarystatement;

public class Ternary01 {
    //Ex 1:Type code to check if a number is even or not by using ternary
    public static void main(String[] args) {
        int num=8;

        //1.Way: Use if-else
        if (num%2==0){
            System.out.println("Even");}else{
            System.out.println("Odd");}

        //2.Way: Ternary
        //       Condition     ?      The code will be executed           The code will be executed
        //                              for true condition           :        for true condition
       String result=num%2==0  ?            "Even"                   :       "Odd";

        System.out.println(result);

        //Ex 2: Type code to check if a number has 3 digits or not, use ternary

        int n=123;
        int length = String.valueOf(n).length();
        System.out.println(length);
        final String msg = length >4
                ? "Number is greater than 3 digit"
                : "Number is less than or equal to 3 digit";
        System.out.println(msg);

    }
}
