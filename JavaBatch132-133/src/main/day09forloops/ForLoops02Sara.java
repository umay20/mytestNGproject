package main.day09forloops;

public class ForLoops02Sara {
    public static void main(String[] args) {
        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*

        String s="Java";
        for( int i=0 ;i<s.length()    ;i++   ){
            System.out.print(s.charAt(i)+"*");
        }


        //Type code to print unique characters in a String.
        //Hello==>Heo
        //indexOf() gives first occurance of the given char,lastIndexOf() gives the last occ of the given char

    }
}
