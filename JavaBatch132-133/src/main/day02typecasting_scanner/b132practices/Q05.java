package main.day02typecasting_scanner.b132practices;

public class Q05 {
    /*
    Write a Java program to break an integer into a sequence of individual digits,
    Hint:use / amd %
    x: input:12345
    output:1
            2
            3
            4
            5

     */
    public static void main(String[] args) {

        int number=12345;
        int ones=number%10;
        System.out.println("ones="+ones);

        int tens=(number/10)%10;
        System.out.println("tens="+tens);

        int hundreds=(number/100)%10;
        System.out.println("hundreds="+hundreds);

        int thousands=(number/1000)%10;
        System.out.println("thousands="+  thousands);

        int tenThousands=number/10000;
        System.out.println("tenThousands="+  tenThousands);

        System.out.println(tenThousands+"\n"+thousands+"\n"+hundreds+"\n"+tens+"\n"+ones);



//it is very easy to take the last number.by using modulus by 10.i will get 5 first.then the number will be 1234,5 which decimal number but my
        //dt still integer so Java will not get the after decimal so my number is 1234 now..if I do math in integer the result will be integer
        //thats why Java will not get after decimals

    }
}
