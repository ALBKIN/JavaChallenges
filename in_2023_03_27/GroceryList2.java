// LEARN JAVA / LOOPS AND ARRAYS / Java Code Challenge: Loops Involving Array Traversal

package in_2023_03_27;

public class GroceryList2 {
    public static int getNumAllergicItems(String[] groceryList) {
        int numAllergicItems = 0;
        for (String item : groceryList) {
            if (item.length() > 5) {
                numAllergicItems++;
            }
        }

        return numAllergicItems;
    }

    public static void main(String[] args) {
        // Below is a sample test case you can use to run your code.
        // Try playing around with different values in the array to test edge cases
        String[] groceryList = {"apple", "milk", "banana", "bananas", "chocolate"};

        System.out.println(getNumAllergicItems(groceryList));
    }
}
