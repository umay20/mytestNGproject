package main.day06stringmanipulationsifstatement;

public class StringManipulations02 {

    public static void main(String[] args) {

        //Ex 1: Type code to check if a given String is empty or not
        //     "Java" ==>>false    -  ""==>true

        String s="java";

        //1.Way; Used length()
        boolean r1=s.length()==0;
                 //s is java.length is 4==0 is not true, assignment operator assigns 'false" to r1
        System.out.println("Is the given String empty?"+r1);

        //2.Way;Recommended bec,there is no comparison op like 1 way,only method. Also always use java methods for a spesific task, we
        //always prefer to use it.
        boolean r2=s.isEmpty();
        System.out.println("Is the given String empty?"+r2);

        //Example 2: Type code to check if a given String is containing just "space character" or not
        //           "     " ==> true      -       "a    b    " ==> false
        String t = "";

        //1.Way:
        boolean r3 = t.replace(" ", "").length()==0;
        System.out.println("Is it containing just space character? " + r3);

        //2.Way:isBlank(); checks if the String has any character different from space
        //      That is why isBlank(); method gives you true for "empty String" as well
        //      "" ==> true      -      "     " ==> true       -       "      x       " ==> false
        boolean r4 = t.isBlank();
        System.out.println("Is it containing just space character? " + r4);

        //Example 3: Type code to join multiple Strings
        //           "Parkland" - "Miami" - "USA" ==> ParklandMiamiUSA
        String u1 = "Parkland";
        String u2 = "Miami";
        String u3 = "USA";

        //1.Way:
        String result1 = u1 + u2 + u3;
        System.out.println(result1);//ParklandMiamiUSA

        //2.Way
        String result2 = u1.concat(u2).concat(u3);
        System.out.println(result2);//ParklandMiamiUSA
    }

    }

