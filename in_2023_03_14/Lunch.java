// LEARN JAVA / LOOPS / Removing Elements During Traversal

package in_2023_03_14;

import java.util.ArrayList;

public class Lunch {

    public static ArrayList<String> removeAnts(ArrayList<String> lunchBox) {
        // Add your code below

        /*
        for-each loop method
        for (int i = 0; i < lunchBox.size(); i++) {
            if (lunchBox.get(i) == "ant") {
                lunchBox.remove(lunchBox.get(i));
                i--;
            }
        }
        return lunchBox;
        */


        // while loop method
        int i = 0;
        while (i < lunchBox.size()) {
            if (lunchBox.get(i) == "ant") {
                lunchBox.remove(i);
            } else {
                i++;
            }
        }
        return lunchBox;
    }


    public static void main(String[] args) {
        ArrayList<String> lunchContainer = new ArrayList<String>();
        lunchContainer.add("apple");
        lunchContainer.add("ant");
        lunchContainer.add("ant");
        lunchContainer.add("sandwich");
        lunchContainer.add("ant");
        lunchContainer = removeAnts(lunchContainer);
        System.out.println(lunchContainer);
    }
}
