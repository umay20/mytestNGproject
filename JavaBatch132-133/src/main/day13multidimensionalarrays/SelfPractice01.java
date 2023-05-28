package main.day13multidimensionalarrays;

import java.util.Arrays;

public class SelfPractice01 {
    public static void main(String[] args) {

        //Ex 1: Create an integer array and print elements less than 10 on the console


        int arr[]=new int[5];

        arr[0]=13;
        arr[1]=6;
        arr[2]=19;
        arr[3]=-8;
        arr[4]=10;

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        //1.Way:  //13,6,19,-8,10,2,87==>all the numbers sent to w and will be checked one by one SO 7 loops will work.we don't want this

        for(int w: arr){
            if(w<10){
            System.out.print(w+" ");
        }}
            System.out.println();

            //2.Way:
            Arrays.sort(arr);//Means arrays in the ascending order now==>-8,2,6,10,13,87(first numbers will be checked and printed until ten,
                                //then loop will be b
                        //arr=-8,6,10,13,19
           for(int y: arr){
            if (y >= 10) { //Ascending orderda old icin benim arrayim break koyduk yoksa ilk elementte loop kirilirdi
                break; //whenever you see 10,break the loop demek, break; boyle kullaniliyor.So java will not check the other numbers
            } else {
                System.out.print(y + " ");
            }}


        //Example 2:Create an integer array and print elements greater than 10 on the console.

        int nums[]=new int[5];

        nums[0]=13;
        nums[1]=6;
        nums[2]=19;
        nums[3]=-8;
        nums[4]=10;
        System.out.println();
        //1.Way:long way

        for(int w: nums){
            if(w>10){
                System.out.print("Integers greater than ten:" +w+ " " );
            }
        }
        System.out.println();

        //2.Way:SONDAN BASLAMAK

        Arrays.sort(nums);//[-8,6,10,13,19]

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]<=10){
                break;
            }else{
                System.out.print(nums[i]+" ");
            }
}
        System.out.println();
        //3.Way:WE WILL USE SORTED ELEMENTS AS WELL.WE WILL LEARN HOW TO SKIP A SPECIFIC ELEMENTS IN FOR-EACH LOOP.
        //I AM STARTING FROM THE FIRST ELEMENT.IN THIS WAY I WORK WITH ALL ELEMENTS SO 2.WAY IS BETTER

        Arrays.sort(nums);

        for(int w: nums){
            if(w<=10){
              continue;//IF YOU WANT TO SKIP ELEMENTS IN A LOOP, USE "CONTINUE" KEYWORD
            }else{
                System.out.print(w+" ");
            }
        }

        }}

