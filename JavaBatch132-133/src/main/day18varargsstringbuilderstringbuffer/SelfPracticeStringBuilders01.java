package main.day18varargsstringbuilderstringbuffer;

public class SelfPracticeStringBuilders01 {


    public static void main(String[] args) {
        String s="Java";
        String t=s.concat("!");
        System.out.println(s); //Java
        System.out.println(t); //Java!



        //Let us create a "Mutable String"
        StringBuilder sb1=new StringBuilder("Java");
        System.out.println(sb1); //Java

        sb1.append("!....").append('!'); //METHOD CHAIN
        System.out.println(sb1); //Java!....! ==> ORIGINAL VALUE IS REMOVED

        sb1.insert(4," is love");
        System.out.println(sb1); //Java is love!....!

        sb1.insert(2,"Money",1,4);
        System.out.println(sb1); //Jaoneva is love!....!

        sb1.replace(2,5,"1");
        System.out.println(sb1);  // Ja1va is love!....!

        sb1.deleteCharAt(2); //ONLY FOR STRINGBUILDER CLASS, NOT IN STRING CLASS
        System.out.println(sb1); //Java is love!....!

        sb1.delete(8,12);
        System.out.println(sb1); // Java is !....!

        sb1.reverse();  //In String class,we were using for loop,very common IQ,here reverse() is enough!!!
        System.out.println(sb1); //!....! si avaJ

        //toString(); is for converting "StringBuilder" to "String", but toString(); method does not change the
        //structure of original "StringBuilder"

        String news=sb1.toString();

        StringBuilder sb2=new StringBuilder("Lava");
        StringBuilder sb3=new StringBuilder("Java");

        int r=sb2.compareTo(sb3);
        System.out.println(r); //2 (sb3 , sb2 dan 2 once geldigi icin +2, parantez ici disindakinden sonra gelseydi -2 verirdi)

//ex:
        String st1 = "Elvira ";
        String st2 = "Kasumova";
        StringBuilder sb = new StringBuilder(st1);
        sb.append(st2);
        String concatenatedStr = sb.toString();
        System.out.println(concatenatedStr);

        //Ex 3. Write a Java program to insert a given string into a specific position of another string using StringBuilder.

        String str1 = "Elvira";
        String str2 = "Kasumova";
        StringBuilder sb4 = new StringBuilder(st1);
        sb.insert(2, st2);//index is inclusive
        System.out.println(sb);

        //Ex 4 Write a Java program to reverse a given string using StringBuilder.

        String str3 = "Elvira";
        String str4 = "Kasumova";
        StringBuilder sb5 = new StringBuilder(st1);
        sb.insert(2, st2);

        sb.reverse();
        System.out.println(sb);
        
    }
}






