package in_2023_07_15;

/*
This class contains the code implementation for Bubble Sort algorithm
 */

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int input[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] >= input[i+1]) {
                    int temp = input[i];
                    input[i] = input[i+1];
                    input[i+1] = temp;
                    swapping = true;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        int[] example = {8 ,12, 20, 14, 53, 7};

        System.out.println("Original unsorted input array: \n" + Arrays.toString(example) +"\n");
        System.out.println("Using Bubble Sort algorithm: ...... \n" + Arrays.toString(bubbleSort(example)));
    }
}
