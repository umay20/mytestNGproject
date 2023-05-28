package main.day05stringmanipulations;

public class Day05Q05Sare {
    public static void main(String[] args) {

        //Task: Count the alphabetical characters in a given value.

        String str="Wow!...Ali is 13 years old and he is a university student!!!";
        int totalNumOfChars=str.length();
        System.out.println(totalNumOfChars);//60

        //Now I have to remove punctuations
        String strWithoutPunct=str.replaceAll("\\p{Punct}","");
        System.out.println(strWithoutPunct);//punctuationsuz variable gormek icin.
        String  strWithoutDigitsAndPunct= str.replaceAll("[^A-Za-z]","");//all spaces and the digits will be removed
        System.out.println(strWithoutDigitsAndPunct.length());//41
        System.out.println(totalNumOfChars-strWithoutDigitsAndPunct.length());//19


    }
}
