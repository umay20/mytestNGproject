package main.day05stringmanipulations;

public class StringManipulations01 {
    //Example 1: Type code to check if the seventh character of a given String is "a" or not

    public static void main(String[] args) {
        String s="Alabama state";
                //0123456 89101112 (7th charactaers index is 6)
        //1.Way:
        boolean result1=s.charAt(6)=='a';//sagda comperison opertor kullandik charAt() boolean verir o yuzden sola boolean
        //== char kullandigimiz icin = Stringte kullanilir?
        System.out.println("Is the seventh character a?"+result1);//true

        //2.Way:
        boolean result2=s.startsWith("a",6);//i wanna see 7th character so i will skip 6 characters to check 7th.
        //when you use startsWith no need to put == like charAt().
        //s means Alabama state so s.startsWith() checks prefix, after skips toffset(6) value.

        System.out.println("Is the seventh character a?"+result2);

        //Note: There are 2 tasks in first way:using charAt() then comparison. In second way there are 1 task for Java
        //less work is better

        //Example 2:Type code to check if a String is ending with "money" or not

        String t="Learn Java earn money";

        //1.Way: substring()
        boolean result3=t.substring(t.length()-5).equals("money");
                                    //21-5==16
                                    //t.substring(16)>>>money . equals ("money")>>gives true (equals methodsgives boolean)
        System.out.println("Is the String ending with 'money'?"+result3);
        //2 way
        boolean result4=t.endsWith("money");
        System.out.println("Is the String ending with 'money'?"+result4);

        //Example 3: Type code to convert "money" to "dollar"?
        //////NOTE: WHEN YOU USE REPLACE() METHOD,create a container to store updates data in it.
        String newT=t.replace("money","dollar");
        System.out.println(t);//this will give you unupdated data>>Learn java earn money
        System.out.println(newT);//Learn Java earn dollar
        //t means learn java earn money

        //Ex 4: Type code to convert "a" to "*"?
        //NOTE: WHEN YOU USE REPLACE("a", "*") METHOD ,ALL "a" S ARE CONVERTED TO "*
        //NOTE:YOU CAN USE "CHAR" AND "sTRINGS" IN REPLACE () METHOD
        //     BUT BOTH MUST BE "CHAR" OR BOTH MUST BE "STRINGS", you cannot make one char one String

        String t2=t.replace("a","*"); //both can be char,both can be String possible
        System.out.println(t2);

        String t3=t.replace("earn","win");
        System.out.println(t3);

    }
}
