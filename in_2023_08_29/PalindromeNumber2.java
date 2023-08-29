/*
LEETCODE JAVA CHALLANGES: 9. PALINDROME NUMBER (Convert toString() solution)
Given an integer x, return true if x is a palindrome, and false otherwise.
*/

package in_2023_08_29;

public class PalindromeNumber2 {
    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String stringX = Integer.toString(x);
        String reversedX = new StringBuilder(stringX).reverse().toString();
        return stringX.equals(reversedX);
    }

        public static void main(String[] args) {
            PalindromeNumber2 test = new PalindromeNumber2();
            System.out.println(test.isPalindrome(101));
            System.out.println(test.isPalindrome(-121));
            System.out.println(test.isPalindrome(121));
        }
}

