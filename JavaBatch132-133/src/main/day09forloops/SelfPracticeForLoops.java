package main.day09forloops;

public class SelfPracticeForLoops {
    public static void main(String[] args) {
        //Example 1:Type code to print all integers from 11 to 44 in the same line with a space between consecutive integers
        //     11 12 13 14....44

    for( int i=11  ;i<45      ;i++     ){
        System.out.print(i+" ");

    }
        System.out.println();
//Example 2: Type code to get even integers from 11 to 44 in the same line with a space between consecutive integers

       for( int i=11  ;i<45     ; i++    ){
           if(i%2==0){
               System.out.print(i+" ");
           }
       }

    }
}
