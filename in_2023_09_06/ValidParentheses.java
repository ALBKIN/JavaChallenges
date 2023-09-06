/*
        LEETCODE JAVA CHALLANGES: 20. VALID PARENTHESES PREFIX

        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

        Example 1:
        Input: s = "()"
        Output: true

        Example 2:
        Input: s = "()[]{}"
        Output: true

        Example 3:
        Input: s = "(]"
        Output: false
 */

package in_2023_09_06;

import java.util.Stack;

public class ValidParentheses {
    Stack<Character> stack = new Stack<>();
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char open = stack.pop();

                    if (!isMatching(open, c)) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

        private boolean isMatching(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }

        public static void main(String[] args) {
            ValidParentheses vp = new ValidParentheses();
            System.out.println(vp.isValid("()")); // should print true
            System.out.println(vp.isValid("()[]{}")); // should print true
            System.out.println(vp.isValid("(]")); // should print false
        }
    }
