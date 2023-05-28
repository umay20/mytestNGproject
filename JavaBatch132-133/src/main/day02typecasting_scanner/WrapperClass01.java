package main.day02typecasting_scanner;


//wrapper classes is used class WrapperClass01 {


public class WrapperClass01 {
    public static void main(String[] args) {
        int age = 13;//there is no method bec its primit
        Integer number = 13;//we are using different structure (not converting) 13 to wrapper class which we can use in a method.otherwise age. dont have the method in it
        //because it is primitive.if i want to add some actions i should use Integer (wrapper class)
        //There are many useful methods-this one is non-primitive dt-Integer

        float numberf = number.floatValue();
        System.out.println(numberf);


        /*Wrapper Class
        non-primitive dts have "methods" together with the values.
        We can do many actions by using methods which is very useful
        But primitives do not have any"methods" bec of that we cannot do any actions/use methods with primitives.
        Java created Wrapper Calss to handle this issue.Java created a new structure which has primitv value and
        methods together.This is called "Wrapper Classes"

         int                            Integer
        Wrapper classes are non-pri data types.

        Primitive Data                 Wrapper Class
         byte                           Byte
         short                          Short
         long                           Long
         float                          Float
         double                         Double
         char                           Character
         boolean                        Boolean

         Not;if your task requires a reserved area but no action with the value in my application use int,otherwise use wrapper class

         */

        char c = 'A';
        Character d = 'A';//d. yazdigimda simdi methodlar cikiyor.action katmak icin wrapper class kullandik b=

        //Autoboxing
        //Assigning primitive data (b) to into a non-pri data(wrapper class of the primitive data)
        //Converting Primitive to object
        byte b = 23;
        Byte wb = b;

        //Unboxing:To convert "wrapper class object"into primitive/object to primitive

        Short ws = 34;
        short s = ws;

        int i = 100;
        Integer iobj = Integer.valueOf(i);
        System.out.println(iobj);

    }
}