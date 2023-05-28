package main.practice.day10practices;

public class Q04 {
    public static void main(String[] args) {
        //Type code to find the sum of the digits of an integer
//  584 ==> 5+8+4= 17  ==> %10 AND ORDINARY DIVISION BY 10

        int sumOfDigits=0;
        int number=584;

        number=Math.abs(number);//Math.abs() will convert a negative number to its positive value==>-666=>666
        //If we have positive number it will return the number itself

        for( int i=number ;i>0      ;i=i/10     ){ //i/10 yaptigimizda inteher dt old icin decimal parti almaz java o yuzden 584/10=58
            sumOfDigits=sumOfDigits+i%10;          //abs value aldik ve sifirdan buyuk olmasi lazim sayinin toplayabilmemiz icin
        }
        System.out.println(sumOfDigits);

    }
}
