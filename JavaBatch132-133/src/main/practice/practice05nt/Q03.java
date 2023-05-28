package main.practice.practice05nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {

 /*
        From a given list find all pairs whose sum is a given number
         {4, 6, 5, -10, 8, 5, 20}==>10
         For ex: 4+6=10, 5+5=10, -10+20=10

  */

        List<Integer> list= Arrays.asList(4,6,5,-10,8,5,20);//we use asList for array , bec it is shorter way to create
                                                            //and i am %100 sure that the size will not be changed
                                                            //Array olarak create yaparsak remove() method doesnt work,set() probably wont work


//        List<Integer>listObject=new ArrayList<>(); bunu kalirdik elementleri ekledikten sonra cunku long way
//        add[0]=1;
//

        //asList() is a shorter way to create a list but if you change the size or remove elements from that list
        //you will get exceptions.//UnsupportedOperationException
        System.out.println(list);

        for (int i=0; i<list.size(); i++){ //starting value is index zero

            for (int k=i+1; k<list.size(); k++ ) {

                if (list.get(i) + list.get(k) == 10) {
                    System.out.println(list.get(i) + " and " + list.get(k));
                }


            }}}}