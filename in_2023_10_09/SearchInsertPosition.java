/*
LEETCODE JAVA CHALLENGES: 35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4
*/


package in_2023_10_09;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

/* LINEAR SOLUTION WITH O(n) time complexity
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
 */

// BINARY SOLUTION WITH O(log n) time complexity
        int left = 0;
        int right = nums.length - 1;

        // Continue the search as long as there is a valig segment to check
        while (left <= right) {
            int mid = left + (right - left) / 2; // Finding the mid point

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // Move to the right side of the array
            } else {
                right = mid -1; // Move to the left side of the array
            }
        }

        // If the target is not found, "left" is the correct position to insert the target
        return left;
    }

        public static void main (String[]args){
            SearchInsertPosition solution = new SearchInsertPosition();

            int[] nums1 = {1, 3, 5, 6};
            int target1 = 5;
            System.out.println("Expected: 2, Actual: " + solution.searchInsert(nums1, target1));

            int[] nums2 = {1, 3, 5, 6};
            int target2 = 2;
            System.out.println("Expected: 1, Actual: " + solution.searchInsert(nums2, target2));

            int[] nums3 = {1, 3, 5, 6};
            int target3 = 7;
            System.out.println("Expected: 4, Actual: " + solution.searchInsert(nums3, target3));
        }
    }

