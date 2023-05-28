package main.day16arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfPractice03 {
    public static void main(String[] args) {

        //Ex1: Convert an Array to a List

        String b[]=new String[5];

        b[0]="Tom";
        b[1]="Ajda";
        b[2]="Cuneyt";
        b[3]="Angelina";
        b[4]="Brad";

        //System.out.println(Arrays.toString(b)); //[Tom, Ajda, Cuneyt, Angelina, Brad]

        List<String> myList= Arrays.asList(b);

        //System.out.println(myList);
        //System.out.println();

        for (String a:myList
             ) {
            System.out.print(a+" ");
        }
        System.out.println();
        for(int i=0;i< myList.size();i++){
            System.out.print(myList.get(i)); //TomAjdaCuneytAngelinaBrad

        }
        System.out.println();
        System.out.println(myList.size()); //5
    }



}
