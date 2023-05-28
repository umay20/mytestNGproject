package main.day06stringmanipulationsifstatement;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        /*
        If you study hard you will get offer soon
        NOTE; TO EXECUTE OUR CODES UNDER SOME CONDITIONS WE USE "IF-STATEMENT"
         */


        //Ex 1: If a number is positive,print positive on the console

        //1.step : I will create a number container
        int a=12;

        //1.Way:
        //2.step :if statement
        if(a>0){
            System.out.println("Positive");//12..sayim -12 ise hicbisey print yapmiyor.Cunku if statement false ise next code calismaz
            //yani sout calismiyor.negative icin alta kod yazmak zorundayiz
        if(a<0){
            System.out.println("Negative");
        }
        if(a==0){
            System.out.println("Neutre");
        }

        //2.Way:
            if(a>0){
                System.out.println("Positive");
            }else if(a<0){
                System.out.println("Negative");
            }else {  //burdaki (a==0) yazmaya gerek yok cunku baska bisey olamaz a=0, o yuzden (a==0) conditionu kaldirdim boylece daha az islem
                System.out.println("Neuter");
            }

            //Ex 2: Type code that prints day names for the given day numbers
            //    1==> Sunday, 2==>Monday,...,7==> Saturday

            Scanner input=new Scanner(System.in);
            System.out.println("Enter day number to see day name");
            byte dayNum = input.nextByte();

            if(dayNum==1){
                System.out.println("Sunday");
            }else if(dayNum==2){
                System.out.println("Monday");
            }else if(dayNum==3){
                System.out.println("Tuesday");
            }else if(dayNum==4){
                System.out.println("Wednesday");
            }else if(dayNum==5){
                System.out.println("Thursday");
            }else if(dayNum==6){
                System.out.println("Friday");
            }else if(dayNum==7){
                System.out.println("Saturday");
            }else{
                System.out.println("I told you to enter day numbers, are you good?...");
            }

        }
    }
}
