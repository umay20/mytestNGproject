package main.day06stringmanipulationsifstatement;

public class StringManipulations01 {

    //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
    //      Alabama==>>look at the a 's index

    //indexOf('a') will give you the index of first occurance of 'a'

    public static void main(String[] args) {
        String s="Alabama";

        int idxA=s.indexOf('a'); //indexOf method can be used char and String as well***
        System.out.println(idxA);

        //Ex 2: Type code to find index of the first occurance of 'java' in a given String "java is easy to learn, java is common in the
        //market,java is OOP" ==>>2

        String t="java is easy to learn, java is common in the market,java is OOP";

        //indexOf("java");will give you the index of first char of the first occurance of "java"

        int idxJava=t.indexOf("java");
        System.out.println(idxJava);

        //NOTE 1; IF YOU USE "NON-EXISTING CHAR OR CHARACTERS " IN INDEXOF() METHOD,IT WILL GIVE YOU -1
        //NOTE 2;//indexOf method can be used char and String DATA TYPES as well***

        //Example 3: Type code to find the index of the last occurrence of 'm' in a given String
        //     miami==> I want to print 3 on the console


        String u="miami";

        //lastIndexOf('m') ;will give you the index of the last occurancy of 'm'
        int idxM=u.lastIndexOf('m');//sag taraf means; go to u and find last indexOf 'm'
        System.out.println(idxM);  //3

        //Example 4: Type code to find the index of the last occurrence of "earn"" in a given String
        //     Learn Java earn money==> I want to print 2 on the console==>>last earn indexi 11-12-13-14 seklinde ,fakat first indexi verecek konsolda

        String v="Learn Java earn money";

        int idxEarn=v.lastIndexOf("earn");
        System.out.println(idxEarn);

        //NOTE 3; IF YOU USE "NON-EXISTING CHAR OR CHARACTERS " IN lastIndexOf() METHOD,IT WILL GIVE YOU -1
        //NOTE 4;//lastIndexOf method can be used char and String DATA TYPES as well***

//Example 5:Type code to check if a given character is unique or not in a given String
//          miami ==> 'a' --> Unique - 'i' --> Not unique

       String y="miami";
       char ch='m';

       boolean r1=y.indexOf(ch)==y.lastIndexOf(ch);
        System.out.println("Is the character unique?"+r1);

         /*
            *****Note: When you type code you should be careful about "coding standards"
                  i)Separate "data" and the "main code"
        */

    }
}
