package main.day03nonprimitivescannerclass;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Example 1: Ask user to enter his first and the last name and address then print them on the console.

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your address,please..");
        String address=input.nextLine();//adres birden cok word oyuzden nextline().bazen nextline() bir sonraki coda gonderir dogru olmaz
        //o yuzden adressi ilk soruyoruz burda    //It is for getting all String from the first character to the last character

        System.out.println("Enter your name,please..");
        String firstName=input.next(); //Stringte double,float gibi nextFloat falan yok. sadece next() kullan sadece o ilk wordu alir.


        System.out.println("Enter your last name,please..");
        String lastName=input.next();//soyadi bir word olacagi icin next() kullandim

        System.out.println(firstName+" "+lastName);
        System.out.println(address);



    }
}
