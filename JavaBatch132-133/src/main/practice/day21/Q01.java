package main.practice.day21;

public class Q01 {
    /*
         Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
    */

    public static void main(String[] args) {

        calculateAverage("Ali", 55, 60, 40, 60, 90, 100);
        calculateAverage("Aisha", 100, 90, 89, 99, 100);

        calculateAverage("Fatma", 90, 80, 50, 89, 99);

        calculateAverage("Veli", 50, 90, 77);

    }

    public static void calculateAverage(String stdName, double ... mark){

        double sum= 0;

        for (double w: mark){

            sum+=w;

        }
        System.out.println(stdName + "'s Average of exams: " + String.format("%.3f", sum/ mark.length));



    }
}