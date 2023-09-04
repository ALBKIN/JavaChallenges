/*
LEETCODE JAVA CHALLANGES: 1614. MAXIMUM NESTING DEPTH OF THE PARENTHESES
Given a VPS (valid parentheses string (denoted VPS)) represented as string s, return the nesting depth of s.
A string is a valid parentheses string (denoted VPS) if it meets one of the following:

    It is an empty string "", or a single character not equal to "(" or ")",
    It can be written as AB (A concatenated with B), where A and B are VPS's, or
    It can be written as (A), where A is a VPS.

We can similarly define the nesting depth depth(S) of any VPS S as follows:

    depth("") = 0
    depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
    depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
    depth("(" + A + ")") = 1 + depth(A), where A is a VPS.

For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

Given a VPS represented as string s, return the nesting depth of s.
*/

package in_2023_09_04;

// Naive solution idea is to consider only parentheses

public class MaximumNestingDepth {
    public int maxDepth(String s) {
        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                counter++;
                maxCounter = Math.max(maxCounter, counter);
            } else if (s.charAt(i) == ')') {
                counter--;
                maxCounter = Math.max(maxCounter, counter);
            }
        }
        return maxCounter;
    }

    public static void main(String[] args) {
        MaximumNestingDepth mds = new MaximumNestingDepth();
       System.out.println(mds.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}
