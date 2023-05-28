package main.day13multidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Example1: Type code to check if a specific element exist in the array or not
        char ch[]=new char[5];

        ch[0]='A';
        ch[1]='Y';
        ch[2]='C';
        ch[3]='I';
        ch[4]='D';

        //Note:contains method not in Arrays,it can be used in Strings

        //1>Way://1.step I am counting the character'Y' first.
        //when I find the first 'Y', I can stop , thats why I used "break;".Task is not asking me how many 'Y' in the array!!!!!

        int counter = 0;

        for(char w : ch){
            if(w=='Y'){
                counter++;
                break;
            }
        }

        if(counter>0){
            System.out.println("It exists");
        }else{
            System.out.println("It does not exists");
        }



        //2.Way:Use binarySearch() method tells you if the element exists or not in the array
        //      To use binarySearch() method, you have to use sort() first

        Arrays.sort(ch);//==>A C S I Y//IF THE CHAR DOESNT EXIST,THE NUMBER MEANS ORDER NUMBER NOT THE INDEX NUMBER
                        //EX: 'X' yazdigimizda binarySearch() metodunda,-5 print yapar cunku - sira numarasini verir,index degil
                        // A C D I (X) Y==> prints -5 on the console ==>'E' prints -4 on the console in binary search
                        //for existing element it gives the index num on the console
                        //binarySearch ten once Arrays.sort mecburi.Yani arrayi kucukten buyuge ya da alfabetik ordera gore siralamak MECBURI


        //binarySearch() method gives you the index of existing element after sorting
        int idx1 = Arrays.binarySearch(ch, 'Y');
        System.out.println(idx1);//4

        int idx2 = Arrays.binarySearch(ch, 'C');
        System.out.println(idx2);//1

        int idx3 = Arrays.binarySearch(ch, 'X');
        System.out.println(idx3);// -5

        int idx4 = Arrays.binarySearch(ch, 'E');
        System.out.println(idx4);//-4


    }
}
