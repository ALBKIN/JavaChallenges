package in_2023_07_15;

/*
This class contains the code implementation for Merge Sort algorithm
 */

import java.util.Arrays;

public class MergeSort {

    public int[] sort(int[] arr) {
        int length = arr.length;
        if (length <= 1) {
            System.out.println(Arrays.toString(arr));
            return arr;
        }
        int midIndex = Math.floorDiv(length, 2);
        int[] leftArray = Arrays.copyOfRange(arr, 0, midIndex);
        int[] rightArray = Arrays.copyOfRange(arr, midIndex, length);
        this.sort(leftArray);
        this.sort(rightArray);
        return null;
    }

    public static void main(String[] args) {
        int[] inputArr = {3, 5 , 2 ,90 , 4 , 7};
        MergeSort sorter = new MergeSort();
        System.out.println(Arrays.toString(sorter.sort(inputArr)));

    }
}
