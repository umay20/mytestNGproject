package main.practice;

public class Umay {
    public static void main(String[] args) {
        String u1 = helloName("Umay");
        System.out.println(u1);


        String abba=makeAbba("Ali","Veli");
        System.out.println(abba);


        System.out.println(m1(true, false, true));
    }

    public void nerdesin(){

        System.out.println("fatih where are you");
    }

    public static void burdayim(){


        System.out.println("burdayim istee");
    }
    public static String helloName(String name) {


        return  "Hello"+" "+name+"!";
    }

    public static String makeAbba(String a, String b) {

        return "a+b"+"b+a";
    }

    public static int m1(boolean b1, boolean... b2) {
        return b2.length;
    }

}
