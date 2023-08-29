/* LEETCODE JAVA CHALLANGES: 1. TWO SUM (Optimized O(n) solution)
   Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
   You may assume that each input would have exactly one solution, and you may not use the same element twice.
   You can return the answer in any order.
*/
package in_2023_08_29;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] testArr = {2, 7, 11, 15};
        int[] testArr2 = {1, 2, 2, 3};
        int testTarget = 9;
        int testTarget2 = 5;

        TwoSum2 test = new TwoSum2();
        int[] res = test.twoSum(testArr, testTarget);
        int[] res2 = test.twoSum(testArr2, testTarget2);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
    }
}