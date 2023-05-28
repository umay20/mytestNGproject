package main.day27enumexeptions;

public class E03 {

    public static void main(String[] args) {

        String s1 = "Java";
        System.out.println(getNumOfCharsInString(s1));//4

        String s2 = "";
        System.out.println(getNumOfCharsInString(s2));//0

        String s3 = " ";
        System.out.println(getNumOfCharsInString(s3));//1

        String s4 = null;
        System.out.println(getNumOfCharsInString(s4));//NullPointerException
        //Some methods in String create issue when we used them with null
        //Java throws "NullPointerException" for this issue

        System.out.println(convertStringToInt("123")-3);//120
        System.out.println(convertStringToInt("123a"));//NumberFormatException ==> For input string: "123a"
        //If you try to convert a String that contains a non-digit character to a number
        //Java throws "NumberFormatException"

    }

        //Example 1: Create a method to get the number of characters in a String

    public static int getNumOfCharsInString(String str){
        try {
            return str.length();
        }catch (NullPointerException e){
            System.out.println("Do not use length() method on null String");
            return 0;
        }
    }

        //Example 2: Create a method to convert a String to an integer

    public static int convertStringToInt(String str){

        try {
            return Integer.valueOf(str);
        }catch (NumberFormatException e){
            System.out.println(str+ " has non-digit character in it.");
            System.out.println(e.getMessage());//To see the "Technical message" use getMessage() method.
            e.printStackTrace();//To see detailed error message use printStackTrace() method
            return 0;
        }
    }
}










