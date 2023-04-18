// JAVA: ALGORITHMS / SEARCHING AND SORTING / Selection Sort

package in_2023_04_18;

import java.util.Arrays;

class SelectionSort {
    public static void selectionSort(String arr[]) {
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int currentMinimumIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[currentMinimumIndex]) < 0) {
                    currentMinimumIndex = j;
                }
            }
            swap(arr, i, currentMinimumIndex);
        }
    }

    public static void swap(String[] arr, int indexOne, int indexTwo) {
        String temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }

    public static void main(String args[]) {
        String[] data = {"dupa", "ass", "vagene", "boobz", "pussy"};
        SelectionSort.selectionSort(data);
        System.out.println(Arrays.toString(data));
    }
}

