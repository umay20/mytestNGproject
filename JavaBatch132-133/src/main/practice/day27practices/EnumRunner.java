package main.practice.day27practices;

import java.util.Arrays;

public class EnumRunner {
    //Write a code that includes vegetable and fruit recommendations by month and tells you the total hours of exercise to be done.
    //Print the months of exercise over 20 hours on the screen.
    public static void main(String[] args) {

        System.out.println("NutritionExercise.July.vegetableOfMonth = " + NutritionExercise.June.vegetableOfMonth);
        System.out.println("NutritionExercise.valueOf(\"March\").hourOfExercise = " + NutritionExercise.valueOf("March").hourOfExercise);
        System.out.println(Arrays.toString(NutritionExercise.values()));
        System.out.println("NutritionExercise.values()[5].hourOfExercise = " + NutritionExercise.values()[5].hourOfExercise);
            //[January, February, March, April, May, June, July, August, September, October, November, December]
        for (NutritionExercise w : NutritionExercise.values()) {
            if (w.hourOfExercise > 20) {
                System.out.println(w + "->" + w.hourOfExercise);
            }
        }
    }
}