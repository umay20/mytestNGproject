package main.day17methodoverloadingdatetimeclasses;

public class SelfPracticeMethodCreation {
    public static void main(String[] args) {

        //Actual values used in method parenthesis are called "arguments" Ex:3,5 below
        int r1=addTwoIntegers(-5,5);
        System.out.println(r1); //0

        String r2=getFirstLastChar("Umay Yalcin");
        System.out.println(r2); //Un

        int r3=sumOfAsciisOfAllChars("Ajda");
        System.out.println(r3); //368


    }


    //Example 1: Create a method adds two integers
    //Variables used in method parenthesis are called "parameters"
    public static int addTwoIntegers (int a,int b){
        return (a+b);
    }

    //Example 2: Create a method prints the first and the last character of a String on the console
    //Note:To convert char 'A' for ex,to String we added "" at the beginning so 'A'+'e' became "Ae"
    public static String getFirstLastChar(String s){
        return ""+s.charAt(0)+s.charAt(s.length()-1); //we could put this statement inside a String result then return result;
                                                        //but to not use the memory we didnt create container,it works like this
    }

    //Example 3: Create a method prints the sum of the ASCII values of characters in a String
    //NOT 1:s.charAt(i)==>Ajda.charAt(i)==>'A'
    //2: 0+'A'==>IF YOU MAKE MATH OPERATION WITH CHAR, IT WILL GIVE YOU ASCII VALUE OF THE CHARACTER

    public static int sumOfAsciisOfAllChars(String s){

        int sumOfAsciis=0;

        for(int i=0; i<s.length(); i++){
            sumOfAsciis=sumOfAsciis+s.charAt(i);
        }
        return sumOfAsciis;
    }

}
