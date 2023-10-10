/*
LEETCODE JAVA CHALLENGES: 67. Add Binary
Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

 */

package in_2023_10_10;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry; // start with the carry value
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // Add the digit from string 'a' if it exists
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0'; // Add the digit from string 'b' if it exists
                j--;
            }

            // append the result for this position
            result.append(sum % 2);
            // determine the new carry for the next iteration
            carry = sum / 2;
        }

        if (carry != 0) { // if there's a leftover carry, append it to the start
            result.append(carry);
        }

        return result.reverse().toString(); // reverse to get the correct order
    }
    public static void main(String[] args) {
        AddBinary solution = new AddBinary();

        String a1 = "11";
        String b1 = "1";
        System.out.println(solution.addBinary(a1, b1));  // Expected: "100"

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(solution.addBinary(a2, b2));  // Expected: "10101"
    }
}
