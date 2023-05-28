package main.practice.practice04ntday13;

import java.util.Arrays;

public class SelfPractice03 {
    public static void main(String[] args) {

        //Type code to check if a specific element in an Array or not

        String[] str={"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};//easier array syntax

       String name="brad";

       int counter=0;

       for(String w:str){
           if(w.equalsIgnoreCase(name)){
               counter++;
           }
       }

       if(counter>0){
           System.out.println(name+" "+"exist");

       }else {
           System.out.println(name+" "+ "does not exist"); //brad does not exist diyor yani equals method is case sensitive
       }                                                    //w.equals() yerine w.equalsIgnoreCase() kullandim
                                                            //IKISI DE STRING TE KULLANILIR

        //2.way:by using binarySearch()

        Arrays.sort(str);
        int idx=Arrays.binarySearch(str,"name");
        System.out.println(idx);//-7

    }
}
