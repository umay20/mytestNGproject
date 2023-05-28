package main.practice.practice04ntday13;

import java.util.Scanner;

public class SelfPractice04 {
    public static void main(String[] args) {

        //Example : Count the number of words starts with "s" in the String
        //String str= {"Learn Java earn money"};

        //NOTE:BU SORUDA 1) STRING CUMLESINI SPLIT() ILE ARRAY ICINE ALDIM
        // 2) FOR EACH LOOP ILE KELIMELERI TEK TEK STARTSWITH() ILE SARTLI BAKTIM
        //3) INT COUNTER OLUSTURUP SAYDIM VAR MI ? KAC TANE VAR DIYE

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str=input.nextLine();

        int counter=0;

        String strArr[]=str.split(" ");

        for(String w:strArr){
            if(w.startsWith("s") || w.startsWith("S")){
                counter++;
            }
        }
        System.out.println(counter + "words are in the sentence");

        if(counter==0){
            System.out.println("There is no word starts with 's' in the sentence");
        }





    }
}
