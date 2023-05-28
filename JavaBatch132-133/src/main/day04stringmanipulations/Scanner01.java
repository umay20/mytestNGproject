package main.day04stringmanipulations;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Ex 1;Get the initials of a name which contains first name and last name
        //      Tom Hanks==>> TH

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first and the last name...");
        String fullName=input.nextLine();

        char first=fullName.charAt(0);
                   //user gave me tom hanks  //charAt(0)this method gets the index 0 which is T and put it in the first container
        char last=fullName.split(" ")[1].charAt(0);//i said cut from space
                  //user gave me tom hanks.//i am saying cut the String from space //then with [1]: after cutting the string select the
        //index [1] which is hanks. then with charAt(0) I am getting H //then we put the H in the last container
        System.out.println(first+"-"+last);

    }
}
