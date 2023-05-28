package main.day02typecasting_scanner;

public class TypeCasting01 {
    public static void main(String[]args){

        //Ex: Create 2 integer variables and 1 String variable
        //Primitive dt are created by Jva>>byte<short<int<long<float<double<--char and boolean
        //Non-pri dts have both values and methods,created by us(many more)>>String dt

        int a=13;
        int b=15;
        String name="Tommy";
        String fullName="Tom Hanks";

        System.out.println(a + b + name);//28Tommy>>aralara bosluk koysan da koymasan da yapisik olarak print verir
        System.out.println(name+a+b);//Tommy1315..stringe bisey add yapilamaz bu sekilde
        System.out.println(name+(a+b));//Tommy28
        System.out.println(fullName +a+b+name );//Tom Hanks1315Tommy>>Hepsini yapistiriyor

        //not;eger islem yapmak istiyorsak sayimisi int olarak istemiyorsak String dt olarak yazabiliriz

        //Type Casting
        /*
        1)Autowidening=Java can put small data types into larger dts automatically W
        when you put small dt into a larger dt,you are widening the small dt
         */
        int m=45;
        System.out.println(m);

        double d=m;
        System.out.println(d);
        /*
        2) Explicitly Narrowing
        Java doesn't put large data type into small data types.
        EN can be used for non-pimitive dts??
         */

        int n=15;
        byte b1= (byte) n; //Called explicitly narrowing







    }


}
