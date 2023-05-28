package main.day14multidimensionalarraysarraylists;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelfPracticeMd01 {
    public static void main(String[] args) {
        //Ex 1: Convert 2 dimensional array to 1 dimensional array
        //     [ [5,3] , [9,8,7] ] ==>[5,3,9,8,7]


        //1.Step:FIND THE NUM OF ELEMENTS IN MD ARRAY
        int[][] arr ={{5,3},{9,8,7}};

        System.out.println(Arrays.deepToString(arr));
        int sum=0;
        for(int[] w:arr){
            sum=sum+w.length;
            }
        System.out.println(sum);

    //2.STEP:CREATE A 1 DIMENSIONAL ARRAY WHOSE NUMBER OF ELEMENTS ARE SAME WITH GIVEN ARRAY

        int brr[]=new int[sum];

    //3.STEP: TRANSFER THE ELEMENTS FROM 2 DM ARRAY TO 1 DM ARRAY

        int idx=0;

        for(int []w:arr){
            for(int k:w){
                brr[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

        }

    }

