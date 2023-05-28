package main.day05stringmanipulations;

public class Day05Q03Sare {

    /*
    String shirtPrice="$ 12.99";
    String bookPrice="$ 35.99";
    Type code to find the sum of the shirt and book prices.

     */

    public static void main(String[] args) {
        String shirtPrice="$ 12.99";
        String bookPrice="$ 35.99";

        String shirt=shirtPrice.replaceAll("$ ","");//after replacement==> "12.99"
        String book=bookPrice.replace("$ ","");//==>"35.99"

        System.out.println(shirt);

//we have values as a String still, so we have to convert to double data type with using Double.valueOf(shirt);
        //valueOf icinde ya string ya da double i cevirme var double dtyp a.
//        double sd=Double.valueOf(shirt);
//        double bd=Double.valueOf(book);
//        System.out.println(sd+bd);
    }
}
