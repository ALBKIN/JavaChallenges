// JAVA: ALGORITHMS / SEARCHING AND SORTING / Binary Search: Iteratively and Recursively

package in_2023_04_17;

public class BinarySearch2 {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                right = mid - 1;
            }

            if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 9, 10};
        int target = 6;

        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}