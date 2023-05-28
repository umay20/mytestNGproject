package main.day13multidimensionalarrays;

import java.util.Arrays;

public class SelfPractice02 {
    public static void main(String[] args) {

        //Example1: Type code to check if a specific element exist in the array or not
        char ch[]=new char[5];

        ch[0]='A';
        ch[1]='Y';
        ch[2]='C';
        ch[3]='I';
        ch[4]='D';

        int counter=0;

        for(int w: ch){
            if(w=='Y'){
                counter++; //It means I am counting the character 'Y'
                break; //when I type this it will take me out of the loop, when I find the 'Y' for the first time.
                // no need to check other elements.COUNTER "0" MEANS DOESNT EXIST, COUNTER 1 MEANS EXIST
            }
        }
        if(counter>0){
            System.out.println("It exist");
        }else{
            System.out.println("It does not exist");
        }

        //2.Way:Use binarySearch() method tells you if the element exists or not in the array
        //      To use binarySearch() method, you have to use sort() first

        Arrays.sort(ch); //[A,C,D,I,Y]

        int idx1=Arrays.binarySearch(ch,'Y');
        System.out.println(idx1);//4 //ELEMENT EXIST ISE INDEX NUMARASINI DEGILSE,- ORDER NUM VERIR BU METOR

        int idx2=Arrays.binarySearch(ch,'I');
        System.out.println(idx2);//3

        int idx3=Arrays.binarySearch(ch,'T');
        System.out.println(idx3);//-5(eger karakter arrayin icinde olsaydi besinci order sirasinda olurdu bu harf o yuzden -5)

    }
}
