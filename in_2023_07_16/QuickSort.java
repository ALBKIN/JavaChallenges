package in_2023_07_16;

import java.util.Arrays;
import java.util.Random;

import static in_2023_07_15.Swap.swap;

public class QuickSort {

    public int partition(int[] arr, int leftPointer, int rightPointer) {
        System.out.println("Current array / subarray being partitioned: " + Arrays.toString(Arrays.copyOfRange(arr, leftPointer, rightPointer + 1)));

        int pivot = arr[Math.floorDiv((leftPointer + rightPointer), 2)];
        System.out.println("The pivot value is: " + pivot);

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] < pivot) {
                leftPointer++;
                System.out.println("Incrementing left pointer to " + arr[leftPointer]);
            }
            while (arr[rightPointer] > pivot) {
                rightPointer--;
                System.out.println("Decrementing right pointer to " + arr[rightPointer]);
            }
            if (leftPointer < rightPointer) {
                System.out.println("Swapping " + arr[leftPointer] + " and " + arr[rightPointer]);
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
            // THIS HANDLES POSSIBLE DUPLICATES IN RANDOMLY GENERATED INPUT ARRAY
            if (leftPointer > rightPointer) {
                break;
            }
        }
        return leftPointer;
    }

    public int[] quickSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        return quickSort(arr, 0, arr.length - 1);
    }

    public int[] quickSort(int[] arr, int start, int end) {
        if (end > start) {
            // Call partition
            int partition = partition(arr, start, end);
            // Recursive code on two sides of partition
            if (start < partition) {
                quickSort(arr, start, partition);
            }
            if (partition + 1 < end) {
                quickSort(arr, partition + 1, end);
            }
        }
        return arr; // Base case code
    }

    public static void main(String[] args) {
        QuickSort qs = new QuickSort();

        int[] unsorted = {3, 58, 17, 9, 98, 22, 7, 9};

       /* Random r = new Random();
        int[] unsorted = new int[6];

        for (int i = 0; i < 6; i++) {
            unsorted[i] = r.nextInt(50);
        }*/

        // int pivotPosition = qs.partition(testArr, 0, testArr.length-1);
        // System.out.println("Pivot position: " + pivotPosition);

        System.out.println("Sorting the array " + Arrays.toString(unsorted));
        qs.quickSort(unsorted);
        System.out.println("Array after sorting: " + Arrays.toString(unsorted));

    }
}
