package main.day16arraylists;

public class SelfPracticePassByValuePassByReference {

    //No method should change the original value,if a method changes the original value, other methods will behave weird
    // (As in example of making different discounts
    //for different class of people).To prevent this Java created that structure BELOW

    public static void main(String[] args) {

        int shirtPrice=100;
        studentShirtPrice(shirtPrice,10); //90
        System.out.println(shirtPrice);//100

        String name="Ajda"; //bu original value,metod can not change the original value when you print it
                            //because Java will CREATE "copy" of the Ajda, and put INSIDE THE METHOD,original one protected
        String result=putExclamation("Ajda");//when I put the method name inside main method,variable will be used in my written method
                                    //this one will give me a data,I am putting it to the container
        System.out.println(result); //Ajda!
        System.out.println(name); //Ajda (original value is protected.Method gave you updated value)


        //Using a method inside the main method is called "Method Call"

        System.out.println(increaseSalary(20000));


        int abs=getAbsValue(-5);
        System.out.println(abs); //5

    }

    public static void studentShirtPrice(int shirtPrice,int discount){ //this method will get the shirt price and discount value,and then
        //it will do subtraction-in the second statement
        //"static" method olmasi lazim yoksa "ststic" olan main metotla calismaz

        int discountedPrice=shirtPrice-discount;

        System.out.println(discountedPrice);//once hicbirsey vermez, sadece discount olusturuyodum bu metodla
                                            //main metotta discount variable i girdikten sonra ilk burasi cikti verdi,
                                            //daha sonra yukardaki sout cikti
                                            //90
    }

    public static String putExclamation(String name) {
        return name + "!"; //means return Ajda! to me

    }
        //Create a method increases the salary 20 percent

       public static double increaseSalary(double salary){
          return salary*1.2;

        }


    //Create a method calculates the absolute value of an integer
    // -5 ==> 5     -     5 ==> 5       -      0 ==> 0
    public static int getAbsValue(int n){
        if(n<0){
            return -1*n;
        }else{
            return n;
        }
    }


}
