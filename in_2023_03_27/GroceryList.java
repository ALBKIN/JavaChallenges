package in_2023_03_27;

public class GroceryList {

    public static double getTotalCost(double[] groceryPrices) {
        double totalCost = 0.0;
        for (double item : groceryPrices) {
            totalCost += item;
        }

        return totalCost;
    }

    public static void main(String[] args) {
        // Below are some sample values you can use to run your code.
        // When you're ready, uncomment the following lines one at a time to test each case.
        // Before running each test case, think about what value you expect to see printed out.
        double[] groceryPrices = {10.0, 12.3, 8.45, 2.43};
        System.out.println(getTotalCost(groceryPrices));

        double[] unlikelyGroceryPrices = {100.23, -100.23, 0.0, -78.54};
        System.out.println(getTotalCost(unlikelyGroceryPrices));
    }
}


