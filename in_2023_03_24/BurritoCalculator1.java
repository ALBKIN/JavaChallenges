// LEARN JAVA / LOOPS AND ARRAYS // Java Code Challenge: Loops Not Involving Traversal


package in_2023_03_24;

public class BurritoCalculator1 {

    public static boolean hasLeftoverFunds(int burritoCost) {
        int budget = 100;
        int numBurritos = 0;

        while (budget >= burritoCost) {
            numBurritos++;
            budget -= burritoCost;
        }
        System.out.println("Remaining budget: " + budget);
        if (budget > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(hasLeftoverFunds(7));
        System.out.println(hasLeftoverFunds(10));
    }
}
