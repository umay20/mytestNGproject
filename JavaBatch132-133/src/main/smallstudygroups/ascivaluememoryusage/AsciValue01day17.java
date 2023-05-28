package main.smallstudygroups.ascivaluememoryusage;

public class AsciValue01day17 {
    public static void main(String[] args) {
        char ch ='A';
        System.out.println(ch);

        // there 2 ways to see the value of char.
        int ch1 ='A';
        System.out.println(ch1);//65

        System.out.println(ch1+0);// 65+0= 65


        System.out.println('a' + 'b');
        System.out.println("a" +('a' + 'b'));//

        ////question=1:  write a program to print  all the ascii value  from  A to  Z.

        for(char i='A'; i<='Z';   i++) {

            System.out.print(i + " ");

        }

        System.out.println("--------");


        for(char i='a'; i<='z';   i++) {

            System.out.print(i + " ");

        }
        System.out.println();

        /// A : 65
        for(int i='A'; i<='Z';   i++) {

            System.out.println("The ASCII Value : "+ (char)i + " " +i);

        }

        System.out.println("----------------");

        for(int i='a'; i<='z';   i++) {

            System.out.println("The ASCII Value : "+ (char)i + " " +i);

        }
}}
