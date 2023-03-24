// LEARN JAVA / LOOPS AND ARRAYS // Java Code Challenge: Loops Not Involving Traversal

package in_2023_03_24;

public class BurritoCalculator3 {
    public static int getNumDivisibleOrders(int lastOrderNumber) {
        int numDivisibleOrders = 0;
        for (int i = 1; i <= lastOrderNumber; i++) {
            if (i % 9 == 0) {
                numDivisibleOrders++;
            }
        }
        return numDivisibleOrders;
    }

    public static void main(String[] args) {

        System.out.println(getNumDivisibleOrders(18));
    }
}
