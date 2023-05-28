package main.day14multidimensionalarraysarraylists;

import java.util.Arrays;

public class Md01TransferingArrays {
    public static void main(String[] args) {

        //Ex 1: Convert 2 dimensional array to 1 dimensional array
        //     [ [5,3] , [9,8,7] ] ==>[5,3,9,8,7]


        int a[][] = { {5, 3}, {9, 8, 7} };//I created md array first

        //1. Step: Find the number of elements in the multidimensional array(which is 5,bec there are 5 elements in the given md array)
        //yani new arrayin lengthi=5
        //to find the num of elements in an array,i will go to the first inner array,get the elements one by one, then second inner array ...
        //so this is repeated action

        int sum = 0;
        // [ [5, 3], [9, 8, 7] ]
        for(int[] w : a){   //INNER ARRAY IS NOT INTEGER, IT IS INTEGER ARRAY SO DT WILL BE INT[] !!!
            sum = sum + w.length; //w.length==>2 in the first,3 in the second outer loop.2+3=5
        }
        System.out.println(sum);//5 THIS IS THE NUMBER OF THE ELEMENTS IN THE ARRAY

        //2. Step: Create new 1 dimensional array whose length is the same
        //         with number of elements in the multidimensional array
        int b[] = new int[sum];

        //3. Step: Transfer the elements from the multidimensional array to the 1 dimensional array

        int idx = 0;
        // [ [5, 3], [9, 8, 7] ]
        for(int[] w : a){
            for(int k : w){
                b[idx] = k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));

    }
}
