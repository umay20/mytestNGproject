package main.practice.day27practices.interface_caltulatesalary;

public class InterfaceRunner {
    /*
  Type code to calculate net salary(Use Interface)

 Salary criteria: Increase gross salary by $100 each year based on the employee's total years of employment.
                  Increase gross salary by $10 for every hour over 160 hours based on the employee's monthly working hours.
                  Deduct 30% tax from the salaries of employees with 10 or more working years and 20% from others.
   */
    public static void main(String[] args) {

        CalculateSalary john = new CalculateSalary();
        double johnsSalary = john.netSalary(5000, 2, 200);
        System.out.println("johnsSalary = " + johnsSalary);

        System.out.println("====================");

        CalculateSalary mark = new CalculateSalary();
        double marksSalary = mark.netSalary(8000, 15, 150);
        System.out.println("marksSalary = " + marksSalary);

        System.out.println("====================");

        CalculateSalary jane = new CalculateSalary();
        double janesSalary = jane.netSalary(10000, 20, 140);
        System.out.println("janesSalary = " + janesSalary);

    }
}