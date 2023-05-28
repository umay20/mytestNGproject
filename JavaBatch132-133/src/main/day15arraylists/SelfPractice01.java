package main.day15arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfPractice01 {
    public static void main(String[] args) {

        //Ex 1: Create a String list, add 5 elements into the list, remove a specific element from the list

        List<String> names = new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Ariana");
        names.add("Tom");
        System.out.println(names); //[Christian, Alex, Tommy, Ariana, Tom]

        boolean isRemoved = names.remove("Alex");
        System.out.println(isRemoved);//true
        System.out.println(names);//[Christian, Tommy, Ariana, Tom]

        String removedElement = names.remove(2);
        System.out.println(removedElement); //Ariana
        System.out.println(names); //[Christian, Tommy, Tom]

        //Ex 2: Create an Integer List, add 6 elements into it,remove a specific element

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(32);
        nums.add(1);
        nums.add(55);
        System.out.println(nums); //[12, 13, 7, 32, 1, 55]

        boolean isRemoved2 = nums.remove((Integer) 13);   //remove(object o    boolean) olan metodu kullandik)
        System.out.println(isRemoved2);//true
        System.out.println(nums); //[12, 7, 32, 1, 55]

        //Example 3: Create a String list, add 5 elements into it, remove the elements whose length is less than 6
        //This is advanced question can be in an interview

        List<String> n = new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        System.out.println(n); //[Christian, Alex, Tommy, Adriana, Tom]

        //LOGIC:I will come to the first element and check if it is less than 6 remove it....it is repeated action use LOOP
        // (for-each loop the best one for lists
        //BUT FOR-EACH LOOP GIVES AN ERROR.BECAUSE AS WE REMOVE THE ELEMENTS LESS THAN 6,LENGTH IS BEING LESS ALSO.SO WE NEED TO DECREASE
        //THE INDEXES AS WE REMOVE ELEMENTS FROM THE LIST.THATS WHY WE WILL USE FOR LOOP
        //******DECREASE YAPMAZSAK SONUC DOGRU DEGIL==>[Christian, Tommy, Adriana] CIKAR, CUNKU LOOP ILK REMOVE DAN SONRA (ALEX) TOMMY'I
        //ATLIYOR INDEX(1) ADRIANA OLUYOR

//        for(String w: n){
//            if(w.length()<6){
//                n.remove(w);
//            }
//        }
        //1.WAY:

//        for(int i=0; i<n.size(); i++){ //size() ==5, yani element sayisi listteki
//            if(n.get(i).length()<6){
//                n.remove(n.get(i));
//                i--;


 //       System.out.println(n);//[Christian,Adriana]

        //2.WAY: To be able to use for-each loop without an error, I should create a cloned array.And I will use cloned array inside the
        //loop, but will update the original loop

        //1.Step:Creating a cloned list

        List<String> clonedN = new ArrayList<>(n);

        for (String w : clonedN) {
            if (w.length() < 6) {
                n.remove(w); //[Christian, Adriana]
            }
        }
        System.out.println(n);
    }}
