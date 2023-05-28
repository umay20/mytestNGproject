package main.practice.day27practices;

public class Q02_Static_Budget {
    //Type a basic home budget
    public static void main(String[] args) {
        Budget father = new Budget();
        father.getSalary(5000);
        father.getPocketMoney(500);
        System.out.println("father.pocketMoney = " + father.pocketMoney);


        Budget mother = new Budget();
        mother.getPocketMoney(1000);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);

        System.out.println("Budget.familyBudget = " + Budget.familyBudget);
        System.out.println("mother.familyBudget = " + mother.familyBudget);
        System.out.println("father.familyBudget = " + father.familyBudget);
        mother.spendPocketMoney(900);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);
        mother.getSalary(3000);
        mother.spendFamilyBudget(2000);
        Budget.spendFamilyBudget(500);
        System.out.println("mother.pocketMoney = " + mother.pocketMoney);
        System.out.println("father.pocketMoney = " + father.pocketMoney);
        System.out.println("Budget.familyBudget = " + Budget.familyBudget);

    }
}