package main.day13multidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Ex 1: Create an integer array and print elements less than 10 on the console

        int ages[]=new int[7];

        ages[0]=13;
        ages[1]=6;
        ages[2]=19;
        ages[3]=-8;
        ages[4]=10;
        ages[5]=2;
        ages[6]=87;



        //1.Way:        //13,6,19,-8,10,2,87==>all the numbers sent to w and will be checked one by one-7 loops will work.we dont want this
        for(int w: ages){
            if(w<10) {
                System.out.print(w + " ");//6 -8 2 ==>>Java checks all the elements in this way.It will not be good when you have so many elements

                //2.Way:

                Arrays.sort(ages);
                //-8,2,6,10,13,19,87
                for (int y : ages) {

                    if (y >= 10) {
                        break; //whenever you see 10,break the loop demek, break; boyle kullaniliyor.So java will not check the other numbers
                    } else {
                        System.out.print(y + " ");
                    }
                }
            }}

        //Example 2:Create an integer array and print elements greater than 10 on the console.

        int nums[] = new int[7];
        nums[0] = 13;
        nums[1] = 6;
        nums[2] = 19;
        nums[3] = -8;
        nums[4] = 10;
        nums[5] = 2;
        nums[6] = 87;

        //1.Way:
        for(int w: nums){
            if(w>10){
                System.out.println(w+" ");
            }

        }
        System.out.println();

        //2.Way: Better way bec there is less work for Java,after coming to 10, java wont check the rest of the numbers

        Arrays.sort(nums);//-8,2,6,10,13,19,87==>FOR EACH LOOP STARTS FROM THE FIRST ELEMENT SO WE WONT USE FOR-EACH ,WE WILL USE FOR-LOOP
        //INSTEAD OF THAT
               //i=6
        for(int i=nums.length-1;i>=0; i--){

                //nums[6]=87==>this gives the element of nums array at the "indexof 6"
            if(nums[i]<=10){
                break;
            }else{
                System.out.print(nums[i]+" ");//87,19,13
            }
        }
        System.out.println();
        //3.Way:WE WILL USE SORTED ELEMENTS AS WELL.WE WILL LEARN HOW TO SKIP A SPECIFIC ELEMENTS IN FOR-EACH LOOP.
        //I AM STARTING FROM THE FIRST ELEMENT.IN THIS WAY I WORK WITH ALL ELEMENTS SO 2.WAY IS BETTER

        for(int w:nums){
            if(w<=10){
                continue;//IF YOU WANT TO SKIP ELEMENTS IN A LOOP, USE "CONTINUE" KEYWORD
            }else{
                System.out.print(w+" ");
            }
        }

    }}
