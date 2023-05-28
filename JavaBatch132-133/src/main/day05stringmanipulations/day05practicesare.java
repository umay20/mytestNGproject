package main.day05stringmanipulations;

public class day05practicesare {
    public static void main(String[] args) {
        //Type code to check if a String does not have any space char at the beginning and at the end
        //Ex==>>"  ALi  "should print false on the console
        //'Ali' should print true on the console

        String str="  Tom   ";
        String trimmedString=str.trim();
        boolean result=str.equals(trimmedString);
        System.out.println("Is there a space at the beginning and at the end?"+!result);

    }
}
