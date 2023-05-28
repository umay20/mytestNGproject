package main.day05stringmanipulations;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Ex 1 : Delete all "y"s from a givem String

        String s="Everything is easy if you study";

        String s1=s.replace("y","");
        System.out.println(s1);//everything is eas if ou stud

        //Ex 2;Delete all digits (0,1,2,3,4,5,6,7,8,9) from a given String
        String t="Tom is 13 years old,and his GPA is 3.98";

        String t1=t.replaceAll("[0-9]","");

        //Note:Just a single digit is a data,all digits are a group of data
        //  To tell Java sth about a group of data we use "REGULAR EXPRESSIONS"(Regex)

        /*
        What is Regex? (There are 100 of regexs these are enough or google it)
        1)All digits==> [0-9]
        2)All lower cases==> [a-z]
        3)All upper cases==> [A-Z]
        4)All letters==> [a-zA-Z]
        5)All letters and digits==>[a-zA-Z0-9]
        6)All vowels==> [aeiouAEIOU]
        7)All puntuation marks==>>\\p{Punct}

       8)All characters "different from "(^) digits ==>[^0-9]
       9)All characters "different from "(^) lower cases ==> [^a-z]
       10)All characters "different from "(^) letters ==> [^a-zA-Z]
       11)All characters "different from "(^) vowels ==> [aeiouAEIOU]

         */

        //Ex 3: Delete all vowels from a given String
        String u="Tom , are you here?";
        String u1=u.replaceAll("[aeiouAEIOU]","");
        System.out.println(u1);

        //Ex 4: Count how many letters are there in a String
        //Logic:i) To Count just the letters, I will delete everything different from letters..
        //    ii)Count the remaining characters
        //    Spaces,punctuation marks will be deleted

        String m="Tom , are you here?";
        int numOfLetters=m.replaceAll("[^a-zA-Z]","").length();
        System.out.println(numOfLetters);

        //Ex 5: Count how many digits are there in a String

        String n="Tom is 13 years old,and his GPA is 3.98";
        int n1=n.replaceAll("[^0-9]","").length();
        System.out.println(n1);

        //Ex 6: Check the user's password according to the given rules
        //    i)Password should have at least 8 characters
        //    ii)Password should not have "space" character
        //    iii)Password should have at least 1 upper case
 //           iv)Password should have at least 1 lower case
//           v)Password should have at least 1 symbol
//           vi)Password should have at least 1 digit

        String pwd="As1?fdes3";
        //    i)Password should have at least 8 characters
        boolean first=pwd.length()>7;
        System.out.println("Is the password containing 8 characters?"+first);

        //    ii)Password should not have "space" character
        boolean second=pwd.replaceAll("[^ ]","").length()==0; //it will change all char diff from space to nothing then i use length()==0 if it is
        //equal to zero. Comperison operation gives boolean.9All char were deleted and i am getting empty string ""==>length() method will
        //give me zero==0 java will tell me true

        System.out.println(second);//true

        //    iii)Password should have at least 1 upper case

        boolean third=pwd.replaceAll("[^A-Z]","").length()>0; //=>0 gerek yok java az calisir
        System.out.println(third);

        //           iv)Password should have at least 1 lower case

        boolean forth=pwd.replaceAll("[^a-z]","").length()>0;
        System.out.println(forth);

//           v)Password should have at least 1 symbol (Not letter, not digit,dont count space as not symbol)
        boolean fifth=pwd.replaceAll("[^a-zA-Z0-9]","").length()>0;
        System.out.println(fifth);

        //           vi)Password should have at least 1 digit

        boolean sixth=pwd.replaceAll("[^0-9]","").length()>0;
        System.out.println(sixth);

    }


}
