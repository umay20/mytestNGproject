package main.day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Ex 1: Create a String list, add 5 elements into the list, remove a specific element from the list

        List<String> names=new ArrayList<>();
        names.add("Christian");
        names.add("Alex");
        names.add("Tommy");
        names.add("Adriana");
        names.add("Tom");
        System.out.println(names); //[Christian, Alex, Tommy, Adriana, Tom]


        //names.remove("Alex"); removes "Alex" from the "names" list
        //remove() method returns true if the element exists and removed, otherwise it will return false.
        boolean isRemoved=names.remove("Alex"); //Jave will go to the name list, remove Alex from the list
        System.out.println(isRemoved);//true
        System.out.println(names);//[Christian, Tommy, Adriana, Tom]

        //names.remove(2); removes the element "at index 2" from the "names" list
        //remove() method with index returns the removed element

        String removedElement = names.remove(2);//indexof 2 will be removed from the "names" list.and,when I print removed element it should display Adriana
        System.out.println(removedElement); //Adriana -to DDOUBLE CHECK JAVA GIVES THE ELEMENT NAME WHEN WE USE INDEX
        System.out.println(names);//[Christian, Tommy, Tom]

        //Ex 2: Create an Integer List, add 6 elements into it,remove a specific element

        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(13);
        ages.add(7);
        ages.add(32);
        ages.add(1);
        ages.add(55);
        System.out.println(ages);//[12, 13, 7, 32, 1, 55]

        //ages.remove(13);//bu hata veriyor

        //If you put an integer into remove() method parenthesis, Java accepts the integer as "primitive int", if the number you put
        //inside remove() method parenthesis is "primitive int", it will be index.
        //WHEN WE TYPE THE "ELEMENT INTEGER" INSIDE PARANTHESIS JAVA ACCEPTS IT AS INTEGER NOT THE ELEMENT!!!!
        //To fix that problem, primitive int to wrapper class by using "(Integer)13"
        //WHEN WE USE WRAPPER INTEGER INSIDE THE PARANTH. Java will accept it as "ELEMENT" not "INDEX"
        //NOTE:We try to remove a specific element(13) from the list, as task want it.We dont need to check 13's index
        boolean isRemoved2 = ages.remove((Integer)13);
        System.out.println(isRemoved2);//true
        System.out.println(ages);

        //Example 3: Create a String list, add 5 elements into it, remove the elements whose length is less than 6

        List<String> n=new ArrayList<>();
        n.add("Christian");
        n.add("Alex");
        n.add("Tommy");
        n.add("Adriana");
        n.add("Tom");
        System.out.println(n); //[Christian, Alex, Tommy, Adriana, Tom]

        //LOGIC:I will come to the first element and check if it it less than 6 remove it....it is repeated action use LOOP(for-each loop the
        //best one
        //it gives error on the console when you do for each loop. Bec as we remove elements one by one each time,my loop's length is changing
        //it was thinking 5 elements,after removing loop changes and will have 4 elements left,all loop structure changes and gives error
        //to fix that ISSUE: i will change for-each loop to for loop

//        for(String w: n){
//            if(w.length()<6){
//                n.remove(w);
//            }
//        }

        //1.Way:Normally we prefer to use "for-each loop" but whenever you have to use "indexes" switch to use "for-loop"
        //In this task we had to decrease indexes(to decrease elements)
        for (int i=0; i<n.size(); i++){    //i stands index, size() is 5
            //get() method gives you the element at a specific index.For example; get(5) gives you the element at index 5
            if(n.get(i).length()<6){
                n.remove(n.get(i));
                i--;
            }
        }

        System.out.println(n);//[Christian,Adriana]

        //2.Way:In this way I will clone my array==>I will use clone array in the loop but I will remove the elements from the original array
        //Thats why i will not need to use decrement part (to decrease indexes) in my loop
        //In this way I am able to use for each loop and will remove the elements from the original list,it doesnt update the cloned list
        //I have two lists here,right is original,left is cloned one.
        //I am using the cloned list in the for-each loop but remove from the right list(n).Since I dont use original loop inside the for-each
        //loop,it is not complaining.
        //How can I clone a list??

        List<String>clonedN=new ArrayList<>(n); //I typed my orginal list name on the right and copied to a new list

        for(String w: clonedN){
            if(w.length()<6){
                n.remove(w);
            }
        }
        System.out.println(n);




    }

}
