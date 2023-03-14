// LEARN JAVA // ARRAYLISTS / Introduction

package in_2023_03_14;

import java.util.Arrays;

class Shopping {

    public static void main(String[] args) {

        String[] groceryItems = {"steak", "milk", "jelly beans"};
        double[] prices = {25.00, 2.95, 2.50};

        // adding ham to the groceries - won't work cause arrays are set and there's no more room
        groceryItems[3] = "ham";
        prices[3] = 4.99;
    }
}
