package main.day05stringmanipulations;

public class Day05Q04Sare {

    public static void main(String[] args) {

        /*
        Create a String variable and find the sum of ASCII values of the first and the last characters of the String.
        String s="Miami";

         */
        String s="Miami";
        int indexOfLastChar=s.length()-1;
        int AsciiFirst=s.charAt(0);//"M"
        int AsciiLast=s.charAt(indexOfLastChar);//"i"

        System.out.println("Total ASCII values of first and last characters:"+(AsciiFirst+AsciiLast));//182.(eger parantez ici yapmasaydik
        //cok farkli bir sayi cikiyor
    }
}
