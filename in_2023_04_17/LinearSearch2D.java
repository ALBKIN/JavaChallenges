// JAVA: ALGORITHMS / SEARCHING AND SORTING / Linear Search with 1D and 2D Arrays

package in_2023_04_17;

public class LinearSearch2D {
    public static int linearSearch2D(String[][] haystack, String target) {
        // write code here
        for (int row = 0; row < haystack.length; row++) {
            for (int column = 0; column < haystack[row].length; column++) {
                if (target.equals(haystack[row][column])) {
                    System.out.println(target + " located at [" + row + "][" + column + "].");
                    return 1;
                }
            }
        }
        System.out.println("Couldn't find the " + target + " in the haystack.");
        return -1;
    }

    public static void main(String[] args) {
        String[][] haystack = {{"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"hay", "hay"}, {"needle", "hay"}, {"hay", "hay"}};
        String target = "needle";
        linearSearch2D(haystack, target);
        linearSearch2D(haystack, "four leaf clover");
    }
}

