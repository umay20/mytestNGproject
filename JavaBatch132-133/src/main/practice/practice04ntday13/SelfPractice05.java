package main.practice.practice04ntday13;

import java.util.ArrayList;
import java.util.List;

public class SelfPractice05 {
    public static void main(String[] args) {

        /** Type code to find the common elements between two String Arrays
         * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

        String[] str1={"John","Brad","Angel","Sofia","Emily"};
        String[] str2={"sofia","brad","grace","emily","hazel"};

        List<String> list= new ArrayList<>();

        for(String w: str1){
            for(String u: str2){
                if(w.equalsIgnoreCase(u)){
                    list.add(u);
                }
            }
        }
        System.out.println(list);
    }
}
