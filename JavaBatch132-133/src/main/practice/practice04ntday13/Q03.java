package main.practice.practice04ntday13;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {


    //Type code to check if a specific element in an Array or not


    //String[] str=new String[6];==> bu syntexi kullanirsan her bir elemani assign yapman gerekir one by one.Asagidaki syntex is the easier
    //one no need to assign elements


        String[] str={"Ellie", "Susan", "Tom", "Brad", "Ali", "Veli"};

        String name= "brad";

        int counter=0;

        for(String w: str){

            if(w.equals(name))

                counter++;
        }
        if(counter>0){

            System.out.println(name + " exists in the Array");
        }else {
            System.out.println(name+ " does not exist in the Array");
        }

        //2.way:by using binarySearch()

        Arrays.sort(str);
        System.out.println(Arrays.toString(str));//[Ali, Brad, Ellie, Susan, Tom, Veli]

        int idx= Arrays.binarySearch(str, name);//binarySearch(obj[] a)==>binarySearch checks the elements from the beginning for their indexes
                                                //eger element yoksa order numarasina gore - degeri verir
        System.out.println(idx);


        int idxSally= Arrays.binarySearch(str, "Sally");

        System.out.println(idxSally);




    }}
