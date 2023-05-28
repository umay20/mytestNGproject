package main.practice.practice04ntday13;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
         /** Type code to find the common elements between two String Arrays
                * (without case sensitivity)
         * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         * Output : [brad,sofia,emily]
         */

        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};

        //Logic: we need to create a list

        List<String> list= new ArrayList<>();

        for (String w: arr){
            for (String u: brr ){
                if (w.equalsIgnoreCase(u)){

                    list.add(u);

                }
            }

        }
        System.out.println(list);//[brad, sofia, emily]


    }
}
