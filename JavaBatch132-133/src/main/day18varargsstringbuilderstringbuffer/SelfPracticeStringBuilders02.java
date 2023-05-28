package main.day18varargsstringbuilderstringbuffer;

public class SelfPracticeStringBuilders02 {

    public static void main(String[] args) {

        //Another way to create a StringBuilder

        StringBuilder sb1=new StringBuilder();//==>when you type this Java gives 16 boxes for capacity.And put Java in the first 4.It is length
        sb1.append("Java");
        sb1.append("xxxxxxxxxxxxx");
        sb1.append("mmmmmmmmmmmmmmmmmm");


        //length(); method gives the number of characters used in the String
        int length =sb1.length();
        System.out.println(length); //4 ==>13xx'ler eklendikten sonra length 17==>18 mm'lerden sonra 35

        int capacity=sb1.capacity();
        System.out.println(capacity); //16==>13xx'ler eklendikten sonra length 34 (16*2+2)==>18 mm'lerden sonra 70(34*2+2)



    }
}
