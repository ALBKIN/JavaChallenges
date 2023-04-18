// JAVA: ALGORITHMS / SEARCHING AND SORTING / Insertion Sort

package in_2023_04_18;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {  // zmiana na ascending order "< 0"
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {7, 2, 14, -7, 72};
        System.out.println("Array in descending order");
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
