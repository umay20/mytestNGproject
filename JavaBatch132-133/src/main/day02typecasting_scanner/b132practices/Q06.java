package main.day02typecasting_scanner.b132practices;

public class Q06 {
    //Type a code to calculate sum of all whole number primitive data types min and max values.

    public static void main(String[] args) {
        //byte,short,integer,long

        byte minByte=Byte.MIN_VALUE;//-128..have 127 character
        byte maxByte=Byte.MAX_VALUE;//127..have 128 char with zero

        short minShort=Short.MIN_VALUE;
        short maxShort=Short.MAX_VALUE;

        int minInt=Integer.MIN_VALUE;
        int maxInt=Integer.MAX_VALUE;

        long minLong=Long.MIN_VALUE;
        long maxLong=Long.MAX_VALUE;

        System.out.println(minByte+maxByte+minShort+maxShort+minInt+maxInt+minLong+maxLong);


    }
}
