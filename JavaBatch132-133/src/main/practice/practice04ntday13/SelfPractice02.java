package main.practice.practice04ntday13;

public class SelfPractice02 {
    public static void main(String[] args) {
        //Type code to print the integers divisible by 4 and 6 from 13 to 211.

        //1.Way: for-loop

        for(int i=13; i<212; i++){
        if(i%4==0 && i%6==0){
            System.out.print(i+" ");
        }}

        System.out.println("============");

        //2.Way:BY USING WHILE-LOOP

        int i=13;
        while(i<212){
            if(i%4==0 && i%6==0){
                System.out.print(i+" ");
            }i++; //INCREMENT PARTI UNUTMA, COMMON MISTAKE
        }





        }
}
