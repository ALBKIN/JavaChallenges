package in_2023_07_15;

/*
This class contains the code implementation for Bubble Sort algorithm
 */

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

import static in_2023_07_15.Swap.swap;

public class BubbleSort {

    public static int[] bubbleSort(int input[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i+1]) {
                    System.out.println(String.format("Swapping pair %d, %d", input[i], input[i+1]));
                    Swap.swap(input, i, i+1);
                    System.out.println(Arrays.toString(input));
                    swapping = true;
                }
            }
        }
        return input;
    }

    public static void main(String[] args) {

        Random r = new Random();
        int[] example = new int[5];
        for (int i = 0; i < 5; i++) {
            example[i] = r.nextInt(50);
        }

        System.out.println("Original unsorted input array: \n" + Arrays.toString(example) +"\n");
        System.out.println("\nResult of using Bubble Sort algorithm: ...... \n" + Arrays.toString(bubbleSort(example)));
    }
}
