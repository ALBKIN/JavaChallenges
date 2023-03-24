// LEARN JAVA / LOOPS AND ARRAYS / Java Code Challenge: Loops Not Involving Traversal

package in_2023_03_24;

public class BurritoCalculator4 {
    public static int getTip(int budget) {
        // MY SOLUTION
        int maxDigit = 0;
        for (int i = 0; i <= budget; i++) {
            int lastDigit = budget % 10;
            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
                budget = budget / 10;
            }
        }
        return maxDigit * 900;
    }

    /* CODECADEMY SOLUTION
        while (budget > 0) {
        int digit = budget % 10;
            if (digit > maxDigit) {
            maxDigit = digit;
            }
            budget /= 10;
        }
        return maxDigit * 900;
     }

     */
    public static void main(String[] args) {

        System.out.println(getTip(123));
        System.out.println(getTip(62));
        System.out.println(getTip(374));
        System.out.println(getTip(599));
        System.out.println(getTip(100287));
    }
}
