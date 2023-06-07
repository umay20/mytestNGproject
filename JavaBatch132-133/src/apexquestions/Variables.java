package apexquestions;

public class Variables {
    public static void main(String[] args) {

        //1) Create double variables for the prices of any 3 items. Print the sum of the prices on the
        //console with a label


        double salary=1200;
        double salary1=1500.90;
        double salary2=2000.500;

        System.out.println("Total salary is:"+salary+salary1+salary2);//Total salary is:4701.4

        //2) Create a float variable, a long variable, and an integer variable for any 3 items. Print the
        //multiplication of the values on the console with a label.

        float salary3=12000;
        long salary4=20000;
        int salary5=15000;

        System.out.println("Multiplication of salaries is:"+salary3*salary4*salary5);//Multiplication of salaries is:3.6E12

        //3) Type a code to find simple interest.
        //Note: Simple interest formula = principal * rate * numberOfYear / 100

//1.Way:
        int principal=10000,rate=6,numberOfYear=3;

        System.out.println("The simple interest is:"+principal * rate * numberOfYear / 100);//The simple interest is:1800
//2.Way:
        int principal1=10000,rate1=6,numberOfYear1=3;
        int simpleInterest=principal * rate * numberOfYear / 100;
        System.out.println("The simple interest is:"+simpleInterest);

        //4) Create a String and two Long variables. Print the sum and the multiplication of the long
        //variables with the String on the console.


        String k="The Result is";
        long l=6;
        long m=7;


        System.out.println(k+" "+(l+m));
        System.out.println(k+" "+(l*m));














    }






}
