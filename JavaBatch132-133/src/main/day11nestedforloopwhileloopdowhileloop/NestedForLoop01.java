package main.day11nestedforloopwhileloopdowhileloop;

public class NestedForLoop01 {
    public static void main(String[] args) {
        //1.step: I should understand if I need nested loop. In every row I need repeated action That is nested loop structure

           /*
               Example 1: Type code to get the output like
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
        */
        int numOfRows = 10;

        for(int i=1; i<=numOfRows; i++){

            for(int k=1; k<=i;  k++){

                System.out.print(k + " ");

            }
            System.out.println();

        }

    }
    }

