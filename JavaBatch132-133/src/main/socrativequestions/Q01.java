package main.socrativequestions;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //1)
        String isim = "Ali Can";
        System.out.println(isim);//Ali Can

        // 2)long data type'larin alabilecegi maximum degeri bulmak icin asagidaki kodlardan hangisi yazilmalidir?
        System.out.println(Long.MAX_VALUE);//9223372036854775807

        //3)
        int yas=25,boy=170;//dogru
        //int yas=25,int boy=25;//yanlis coding


        //4)
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Lutfen -128(dahil) ile 127(dahil) arasinda bir sayi giriniz");
//
//        boolean sayi = scan.nextBoolean();
//
//        System.out.println(5*sayi);  //java: bad operand types for binary operator '*'

        //5)Hnagisi 18 yazdirir?==>"yasi" ==>yasi yazdirirken (yasi)==>18 yazdirir
        int yasi = 18;
        System.out.print("yasi:"+yasi);//yasi:18




    }


}
