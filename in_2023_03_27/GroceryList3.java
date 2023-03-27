// LEARN JAVA / LOOPS AND ARRAYS / Java Code Challenge: Loops Involving Array Traversal

package in_2023_03_27;

public class GroceryList3 {

    public static boolean hasSpecialItem(double[] groceryPrices) {

        for (double itemCost : groceryPrices) {
            String itemCostStr = String.valueOf(itemCost);
            if (itemCostStr.length() > 1 && itemCostStr.substring(itemCostStr.length() - 2, itemCostStr.length()).equals("99")) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Below is a sample test case you can use to run your code.
        // Try playing around with different values in the array to test edge cases
        double[] groceryList = {10.0, 89.9, 8.99, 2.34};
        System.out.println(hasSpecialItem(groceryList));
    }
}
