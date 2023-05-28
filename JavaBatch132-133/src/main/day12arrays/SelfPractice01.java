package main.day12arrays;

import java.util.Arrays;

public class SelfPractice01 {

    public static void main(String[] args) {
        //How to create an Array??? sixgradeerslarla ilgili bir isim arrayi yap

        String sixGraders[]=new String[5];

        //How to print an Array on the console
        System.out.println(sixGraders);//[Ljava.lang.String;@4dd8dc3

        //Add elements on the created array??
        sixGraders[0]="Ali";

        //Example1):Which one gives t on the console?

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        int arr3[] = {3, 2, 1};


        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(arr1==arr1);
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1.equals(arr2));



    }
}
