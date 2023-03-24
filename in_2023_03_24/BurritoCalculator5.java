// LEARN JAVA / LOOPS AND ARRAYS / Java Code Challenge: Loops Not Involving Traversal

package in_2023_03_24;

public class BurritoCalculator5 {

    public static int getReverseBudget(int budget) {
        int reverseBudget = 0;
        while (budget > 0) {
            int lastDigit = budget % 10;
            budget = budget / 10;
            reverseBudget = (reverseBudget * 10) + lastDigit;
        }
        return reverseBudget;
    }

    public static void main(String[] args) {
    /*
    Try passing different arguments for your budget
    with varying numbers of digits, like 62, 374, 599, etc
     */
        System.out.println(getReverseBudget(132));
        System.out.println(getReverseBudget(62));
        System.out.println(getReverseBudget(374));
        System.out.println(getReverseBudget(599));
    }
}