package main.practice.day27practices;

public class Budget {

    public static int familyBudget;
    public int pocketMoney;


    public void getPocketMoney(int money) {
        if (familyBudget >= money) {
            familyBudget -= money;
            pocketMoney += money;
        }
    }


    public void getSalary(int salary) {
        familyBudget += salary;
    }


    public static void spendFamilyBudget(int money) {
        familyBudget -= money;
    }


    public void spendPocketMoney(int money) {
        pocketMoney -= money;
    }
}