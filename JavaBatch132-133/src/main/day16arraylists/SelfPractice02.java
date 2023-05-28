package main.day16arraylists;

import java.util.ArrayList;
import java.util.List;

public class SelfPractice02 {
    public static void main(String[] args) {

        //Example 1: Create a salary list and increase the salary %10 if the salary is less than 5000 dollars.
        //           [4500, 6400, 2300, 5000, 7150] ==> 4500-->4950 - 2300-->2530
        //           [4950, 6400, 2530, 5000, 7150]

        //Normally we use "DOUBLE" for salaries,but we use Integer dt for the list but it didnt work,and we understood it them we updated
        //our dt to double
        List<Double> salaries=new ArrayList<>();
        salaries.add(4500.0);
        salaries.add(6400.0);
        salaries.add(2300.0);
        salaries.add(5000.0);
        salaries.add(7150.0);

        System.out.println(salaries);

        //1.Way:
       // for(Integer w: salaries){ this didn't work bec java doesnt do EN for non-primitive dt in Lists.Lists can work with the non-pri
        //dts only,primitive dts cannot be used in lists(byte,short,long,int,float,double)

        for(Double w:salaries){
            if(w<5000){
                salaries.set(salaries.indexOf(w),w*1.1 );//[4950.0, 6400.0, 2530.0, 5000.0, 7150.0]
                                //4500,4950 veriyor bu metot. indexOf(w) direk yazamazsin cunku dottan sonra yazilir metot old icin
                                //bunun icin de salaries.indexOf(w) kullaniliyor
            }
        }
        System.out.println(salaries);

        //2.Way:

        for(Double w:salaries){
            if(w>=500){
                continue;
            }else{
                salaries.set(salaries.indexOf(w),w*1.1 );
            }
        }
        System.out.println(salaries); //[4950.0, 6400.0, 2530.0, 5000.0, 7150.0]


    }
}
