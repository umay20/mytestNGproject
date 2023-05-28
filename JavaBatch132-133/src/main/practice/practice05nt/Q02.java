package main.practice.practice05nt;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {

     /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */

        int[] arr={12, 5, 8, 87, 21, 13, 15, 90};

        Arrays.sort(arr);

        int middleIdx= arr.length/2;

        System.out.println(Arrays.toString(arr));//[5, 8, 12, 13, 15, 21, 87, 90]

        if (arr.length %2 !=0){

            System.out.println(arr[middleIdx]);
        }else{

            int middle= (arr[middleIdx] + arr[middleIdx-1])/2;

            System.out.println(middle);//14
        }


    }
}
