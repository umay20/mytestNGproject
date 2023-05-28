package main.practice.day27practices;

public enum NutritionExercise {

    January("Carrot", "Pomegranate", 17),
    February("Cabbage", "Quince", 16),
    March("Arugula", "Banana", 19),
    April("Artichoke", "Cagla", 20),
    May("Eggplant", "Plum", 22),
    June("Tomato", "Apricot", 27),
    July("Corn", "Watermelon", 30),
    August("Pipe", "Fig", 29),
    September("Mushroom", "Grape", 26),
    October("Cabbage", "Pear", 24),
    November("Cauliflower", "Persimmon", 21),
    December("Leek", "Orange", 19);

    final String vegetableOfMonth;
    final String fruitOfMonth;
    final int hourOfExercise;

    NutritionExercise(String vegetableOfMonth, String fruitOfMonth, int hourOfExercise) {
        this.vegetableOfMonth = vegetableOfMonth;
        this.fruitOfMonth = fruitOfMonth;
        this.hourOfExercise = hourOfExercise;
    }
}