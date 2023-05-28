package main.practice.day10practices;

public class SelfPracticeQ04 {
    public static void main(String[] args) {
        //Type code to find the sum of the digits of an integer
//  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sumOfDigits=0;
        int num=588;
        num=Math.abs(num);

        for(int i=num ;i>0 ; i=i/10   ){
            sumOfDigits=sumOfDigits+i%10;

        } System.out.print(sumOfDigits);//21

    }
}
