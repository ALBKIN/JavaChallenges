// JAVA: ALGORITHMS / SEARCHING AND SORTING / Selection Sort: Swap


package in_2023_04_18;

import java.util.Arrays;

class SelectionSort1 {
    public static void selectionSort(int arr[]) {

        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int currentMinimumIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[currentMinimumIndex]) {
                    currentMinimumIndex = j;
                }
            }
            // call swap() here
            int[] swapData = {-10, 15, 18, 10, 25};
            //provide arguments for 'swap()'
            SelectionSort1.swap(arr, i, currentMinimumIndex);
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void swap(int[] arr, int indexOne, int indexTwo) {
        // write swap code here
        int temp = arr[indexTwo];
        arr[indexTwo] = arr[indexOne];
        arr[indexOne] = temp;
    }

    public static void main(String args[]) {
        int[] data = {2, 7, -7, 20, 5};
        SelectionSort1.selectionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
