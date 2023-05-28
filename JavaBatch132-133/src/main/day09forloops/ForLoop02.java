package main.day09forloops;

public class ForLoop02 {

    public static void main(String[] args) {

        //Example 1: Put * between 2 consecutive characters and to the end in a String.
        //           For example; "Java" ==> J*a*v*a*
        String s = "Java";
        for(int i=0;  i<s.length(); i++){
            System.out.print(s.charAt(i) + "*");
        }

        System.out.println();

        //Example 2(INTERVIEW QUESTION): Type code to print unique characters in a String.
        //           Hello ==> Heo
        String t = "Hello";

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(t.indexOf(ch) == t.lastIndexOf(ch)){
                System.out.print(ch);
            }
        }
        System.out.println();
        //Example 3 (INTERVIEW QUESTION): Type code to print a String in reverse. For example; "Ali Can" ==> "naCilA"
        //I should get the last char then i should get second last char then third last character.4th step:I will get space char .5th
        //step:get the i ....7th stepte A i alip print yapmam gerek.Repeated action old icin loop  kullanmaliyim

        String u="Ali Can";
        for (int i=u.length()-1; i>=0; i--){
            char ch=u.charAt(i);
            System.out.print(ch); //naC ilA
        }

        System.out.println();

        //Example 4: Type code to find the sum of the integers from 3 to 7
        //I will create a container at the beginning and name it as sum  then put Zero-0 in it. Then I will do addition
        // with the first number (0+3=3=>)
        //then will put 3 to container.
    int sum=0;

    for(  int i=3 ;i<8     ;i++     ){

        sum=sum+i;
    }
        System.out.println(sum);


    }}
