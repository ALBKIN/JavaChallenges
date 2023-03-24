// LEARN JAVA / LOOPS AND ARRAYS // Java Code Challenge: Loops Not Involving Traversal

package in_2023_03_24;

public class BurritoCalculator2 {
    public static int getBurritosSold(int lastOrderNumber) {
        int totalBurritosSold = 0;

        for (int i = 0; i <= lastOrderNumber; i++) {
            totalBurritosSold += lastOrderNumber;
        }

        return totalBurritosSold;
    }

    public static void main(String[] args) {
        System.out.println(getBurritosSold(548));
    }
}
