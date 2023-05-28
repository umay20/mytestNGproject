package main.day16arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {

    //Ex   : Find two closest integer in a given list ***COMMON INTERVIEW QUESTION
    //      [12,15,10,14]==>15 and 14

    //Logic: I will get the elements from list, 1.step: I will sort the elements(in ascending order with sort() method)
    //2.step i will create a container , I will put the difference of first 2 elements into the container,first I will put first and second elements
    //difference,then will get difference between second and third elements then I will compare them.
    //after getting first 2 difference I will use min() to compare then will get diff betw 3rd and 4th and compare it the other difference
    //i have to find minimum difference at the end so I can find the less minimum value

    public static void main(String[] args) {

        //Example 1: Find two closest integer in a given list (COMMON IQ)
        //           [12, 15, 10, 14] ==> 15 and 14

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(15);
        nums.add(10);
        nums.add(14);

        System.out.println(nums);

        Collections.sort(nums);
        System.out.println(nums);

        int minDiff = nums.get(1) - nums.get(0);

        for(int i=1; i< nums.size(); i++){
            minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));
        }

        System.out.println(minDiff);//1

        for(int i=1; i< nums.size(); i++){

            if(nums.get(i) - nums.get(i-1) == minDiff){
                System.out.println(nums.get(i-1) + " and " + nums.get(i));
            }
        }

}}
