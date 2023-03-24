// LEARN JAVA / LOOPS AND ARRAYS // Java Code Challenge: Loops Not Involving Traversal

package in_2023_03_24;

public class BurritoCalculator {
    public static int getBurritoQuantity(int burritoCost) {
        int budget = 4267;

        int numBurritos = 0;
        while (budget >= burritoCost) {
            numBurritos++;
            budget -= burritoCost;
        }
        return numBurritos;
    }

    public static void main(String[] args) {
        System.out.println(getBurritoQuantity(7));
    }
}
