/*
LEETCODE JAVA CHALLENGES: 66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].

Example 3:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].

 */

package in_2023_10_10;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        // If the code reached here, all digits were 9
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();

        int[] digits1 = {1, 2, 3};
        int[] resutl1 = plusOne.plusOne(digits1);
        System.out.println(java.util.Arrays.toString(resutl1));  // Expected: [1,2,4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne.plusOne(digits2);
        System.out.println(java.util.Arrays.toString(result2));  // Expected: [4,3,2,2]

        int[] digits3 = {9};
        int[] result3 = plusOne.plusOne(digits3);
        System.out.println(java.util.Arrays.toString(result3));  // Expected: [1,0]
    }
}

