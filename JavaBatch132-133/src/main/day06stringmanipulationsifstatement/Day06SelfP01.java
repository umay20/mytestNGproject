package main.day06stringmanipulationsifstatement;

public class Day06SelfP01 {
    public static void main(String[] args) {
        //Example 1: Type code to find the index of the first occurrence of 'a' in a given String
        //      Alabama==>>look at the a 's index
        //indexOf('a') will give you the index of first occurance of 'a'

        String m="Marmara";
        int idxOfm=m.indexOf('a');
        System.out.println(idxOfm);//1

        //Ex 2: Type code to find index of the first occurance of 'java' in a given String "java is easy to learn, java is common in the
        //market,java is OOP" ==>>2
        //indexOf("java");will give you the index of first char of the first occurance of "java"

        String n="java is easy to learn, java is common in the market,java is OOP";
        int idxOfJava=n.indexOf("java");
        System.out.println(idxOfJava);//0

        //Example 3: Type code to find the index of the last occurrence of 'm' in a given String
        //     miami==> I want to print 3 on the console

        String l="miami";
        int lastIdxM=l.lastIndexOf('m');
        System.out.println(lastIdxM);//3

        //Example 4: Type code to find the index of the last occurrence of "earn"" in a given String
        //     Learn Java earn money==> I want to print 2 on the console==>>last earn indexi 11-12-13-14 seklinde ,
        //     fakat first indexi verecek konsolda

        String k="Learn Java earn money";
        int lastIdxOfEarn=k.lastIndexOf("earn");
        System.out.println(lastIdxOfEarn);//11==> last occurance of earn's first Characters index

//Example 5:Type code to check if a given character is unique or not in a given String
//          miami ==> 'a' --> Unique - 'i' --> Not unique

        String p="miami";
        //p.indexOf('i')==

    }
}
