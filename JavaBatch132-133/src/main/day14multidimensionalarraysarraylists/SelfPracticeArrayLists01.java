package main.day14multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SelfPracticeArrayLists01 {
    public static void main(String[] args) {

        //Example 1:Type code to check if two lists have same elements.
        //          Same elements can be in different indexes.
        //          [A, B, C] and [A, C, B] and [B, A, C] etc ==> true


        List<Character> ch1=new ArrayList<>();
        ch1.add('A');
        ch1.add('B');
        ch1.add('C');
        System.out.println(ch1);

        List<Character>ch2= new ArrayList<>();
        ch2.add('A');
        ch2.add('C');
        ch2.add('B');
        System.out.println(ch2);


        Collections.sort(ch1);
        Collections.sort(ch2);

        boolean r4=ch1.equals(ch2);
        System.out.println(r4);

        //BU SORUDA CONTAINS METODU DA KULLANABILIRSIN FAKAT BIZ SORT() OGRENDIK, EQUALS() KULLANMAK ICIN INDEXLERI VE KARAKTERLERI ESIT
        //OLMASI GEREKIYOR CUNKI


    }
}
