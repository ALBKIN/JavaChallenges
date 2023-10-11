/*
LEETCODE JAVA CHALLENGES: 69. Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
*/

package in_2023_10_11;


public class Sqrt {
    public int mySqrt(int x) {

/*      // easiest solution using Java function

        int result = (int) Math.sqrt(x);
        System.out.println(result);
        return result;
*/

// requested solution (without using built-in function or operator). Using binary search
        if (x == 0 || x == 1) {
            return x;
        }

        long start = 0; // using long to avoid possible overflow
        long end = x;
        while (start <= end) {
            long mid = (start + end) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // return end because we want the floor value of the square root
        return (int) end;
    }

    public static void main(String[] args) {
        Sqrt sqrt = new Sqrt();

// Test cases
        System.out.println("Input: 4, Output: " + sqrt.mySqrt(4));  // Expected output: 2
        System.out.println("Input: 8, Output: " + sqrt.mySqrt(8));  // Expected output: 2
        System.out.println("Input: 16, Output: " + sqrt.mySqrt(16));  // Expected output: 4
        System.out.println("Input: 1, Output: " + sqrt.mySqrt(1));  // Expected output: 1
        System.out.println("Input: 0, Output: " + sqrt.mySqrt(0));  // Expected output: 0
        System.out.println("Input: 10, Output: " + sqrt.mySqrt(10));  // Expected output: 3
    }

}
