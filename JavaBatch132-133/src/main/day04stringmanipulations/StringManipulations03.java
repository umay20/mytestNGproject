package main.day04stringmanipulations;

public class StringManipulations03 {

    public static void main(String[] args) {

        //Ex 1: Check the password if it has given rules.
        //    i)It should start with "J"
        //    ii)It should have at least 8 characters
        //   iii)Last 3 characters should be "AVA"


        String pwd="J12!?AVA";
        //i)It should start with "J"
        boolean first=pwd.startsWith("J");
        System.out.println("First rule:"+first);

        //    ii)It should have at least 8 characters
        //Note:There are "comparison operators" in Java: "==", "<", ">", "<=", ">=","!=" We ave 6 comp operators
        //Whrn you use comp operators you will get BOOLEAN EVERY TIME
        //Ex:
        boolean second=pwd.length()>7;
        System.out.println("Second rule:"+second);


        //   iii)Last 3 characters should be "AVA"//substring in pwd,AVA has >>5,6,7 indexes, first inc last exclusive
        boolean third=pwd.substring(5,8).equals("AVA");//return will be true /false thats why I created boolean
        //NOTE: if you want to get characters from an index to the last character,
        // use substring () method just with the starting index >>> (5,8) yerine (5)
        System.out.println("Third rule:"+third);


    }
}
