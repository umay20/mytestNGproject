package main.day04stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {
         //Ex: Get the first 4 characters from a String and convert them to lower cases
        //     Albania==> Alba =>> alba

        String s="Albania";
        String t=s.substring(0,4).toLowerCase();//substring is the String is first characters.first index inclusive,second exclusive
        System.out.println(t);

        //Ex2: Check if two Strings are same or not ?
        //1.option focusses on the cases, second option wont focus the cases
        String r="Java";
        String u="Java";

        //boolean sameEqualSign=r=u;
        //System.out.println(sameEqualSign);//false bec values and addresses are different


        boolean same=r.equals(u);
        System.out.println(same);//false


        boolean sameIgnoreCases=r.equalsIgnoreCase(u);
        System.out.println(sameIgnoreCases);//true

        //Question: Why we do not use "==" to compare Strings?(like integers)
        //1.Scenario:"==" and "equals()" method gives you the same output

        String s1="TechPro";
        String s2="TechPro";//(if the value are the same

        boolean r1=s1==s2;
        System.out.println(r1);

        boolean r2=s1.equals(s2);
        System.out.println(r2);


        //3rd Scenario:"==" and "equals() gives you diff output
        String t1="Pyton";
        String t2=new String("Pyton");

        boolean d1=t1==t2;
        System.out.println(d1);

        boolean d2=t1.equals(t2);
        System.out.println(d2);








    }
}
