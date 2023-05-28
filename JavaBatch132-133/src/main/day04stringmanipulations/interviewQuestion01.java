package main.day04stringmanipulations;

public class interviewQuestion01 {
    public static void main(String[] args) {

        //Ex 1: Type code to swap the integers
        //    a=12 and b=5==> a=5 and b=12

       int a=12;
       int b=5;
        System.out.println(a+"-"+b);


        //1.Way by using third variable
       int temp=0;//0 olan int temp containiri create ettim

       //1.Step
        temp=a;//asss op takes the value into the right then puts it in the left container

        //2.Step
        a=b;

        //3.Step:
        b=temp;

        System.out.println(a+"-"+b);

        //2.Way: Do not create 3rd variable

        int x=12;
        int y=5;

        System.out.println(x+"-"+y);//12-5

        x=x+y;

        y=x-y;
        x=x-y;
        System.out.println(x+"-"+y);//5-12




    }
}
