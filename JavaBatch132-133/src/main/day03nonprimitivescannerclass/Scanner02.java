package main.day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Example 1: Get shirtPrice and shoePrice from user and print the total price on the console

        //to create a scnner object;
        Scanner input=new Scanner(System.in);
        System.out.println("Give me shirt price,please...");
        double shirt=input.nextDouble();

        System.out.println("Give me shoes price,please...");//user have to use " . " virgul degil
        double shoes=input.nextDouble();

        System.out.println(shirt+shoes);
        //sout("Total price is"+(shirt+shoes)); parantez icini hightlight yap parantez ac kapatmayi java yapar.
        //parantez koymazsan string aldilar toplama yapmaz concatination

    }
}
