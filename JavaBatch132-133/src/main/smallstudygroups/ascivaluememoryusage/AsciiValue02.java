package main.smallstudygroups.ascivaluememoryusage;

public class AsciiValue02 {
    public static void main(String[] args) {
        // write the program to calculate the sum  all ascii value of  lowercase a to z

        int sum = 0;

        for(int i='a'; i<='z'; i++){

            sum = sum +i;
        }
        System.out.println(sum);//2847


        int sum1 = 0;

        for(int i='A'; i<='Z'; i++){

            sum1 = sum1 +i;//sum1+=i
        }
        System.out.println(sum1);//2015

        // a b c d e f
        // a b c d e f
        // a b c d e f
        // a b c d e f
        // a b c d e f


        System.out.println("-----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 'a'; j <= 'f'; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }


        ///


        char input ='f';

        for (char i = 'a'; i <input; i++) {

            for (char j = 'a'; j <= i; j++) {
                System.out.print("*"+  " ");
            }
            System.out.println("");
}}}
