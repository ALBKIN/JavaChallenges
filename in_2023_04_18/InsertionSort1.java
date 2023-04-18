// JAVA: ALGORITHMS / SEARCHING AND SORTING / Insertion Sort Review

package in_2023_04_18;

import java.util.Arrays;

public class InsertionSort1 {
    public static void sort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            String current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareToIgnoreCase(current) > 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        String[] erectors = {"dÓpa", "asS", "Vagene", "pu$$y", "b00bz"};
        sort(erectors);
        System.out.println(Arrays.toString(erectors));
    }
}
