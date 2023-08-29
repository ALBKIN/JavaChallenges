/* LEETCODE JAVA CHALLANGES: 1. TWO SUM (brute force O(n^2) time complexity solution)
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
*/
package in_2023_08_29;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testArr = {2, 7, 11, 15};
        int[] testArr2 = {3, 2, 4};
        int testTarget = 9;
        int testTarget2 = 6;

        TwoSum test = new TwoSum();
        int[] res = test.twoSum(testArr, testTarget);
        int[] res2 = test.twoSum(testArr2, testTarget2);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
    }
}
