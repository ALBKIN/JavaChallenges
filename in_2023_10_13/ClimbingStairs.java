/*
LEETCODE JAVA CHALLENGES: 70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Example 1:
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps

Example 2:
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

 */


package in_2023_10_13;

public class ClimbingStairs {
    public int climbStairs(int n) {

        // Recursive solution
    /*
        if (n == 0 || n == 1) {
            return 1;
        } else {
         return climbStairs(n-1) + climbStairs(n-2);
        }
    }
    */

        // Dynamic Programming solution
        if (n == 1) {
            return 1;
        }

        int[] stairsArray = new int[n + 1];
        stairsArray[1] = 1;
        stairsArray[2] = 2;

        for (int i = 3; i <= n; i++) {
            stairsArray[i] = stairsArray[i - 1] + stairsArray[i - 2];
        }
        return stairsArray[n];
    }
}

