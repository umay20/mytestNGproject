package main.day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class Md03 {
    public static void main(String[] args) {
        //EX 1: Find the sum of the min and maximum elements in a md array

        //Note:bu kod her tur md array ve de - elementler icin de gecerli

        int arr[][]= {{5,4},{10,6,7}};

        int sum=0;
        int small=arr[0][0]; //to make the first element minimum //FOR LOOPTAN SONRA CREATE ETTIK SONRA MATH METODUNA GECTIK
        int big = arr[0][0];

        for(int[] w: arr){ //INNER ARRAYIN DT I INTEGER
            for(int k:w){   //DT OF THE ELEMENTS IS INTEGER
                small=Math.min(small,k); //we created this after creating small array
                                    //bu method bize small olan sayiyi verecek
                big = Math.max(big, k);
            }

        }
        System.out.println(small);
        System.out.println(big);
        System.out.println(small + big);



    }
}
