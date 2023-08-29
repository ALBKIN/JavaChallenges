/*
LEETCODE JAVA CHALLANGES: 9. PALINDROME NUMBER (optimized solution)
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

package in_2023_08_29;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int reversedX = 0;
        int originalX = x;
        while (x != 0) {
            reversedX = (reversedX * 10) + (x % 10);
            x /= 10;
        }
        return (reversedX == originalX);
    }

    public static void main(String[] args) {
        PalindromeNumber test = new PalindromeNumber();
        System.out.println(test.isPalindrome(101));
        System.out.println(test.isPalindrome(-121));
        System.out.println(test.isPalindrome(121));
    }
}
