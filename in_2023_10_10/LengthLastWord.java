/*
LEETCODE JAVA CHALLENGES: 58. Length of Last Word

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.

 */

package in_2023_10_10;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip possible whitespaces on the end
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word of the string till the beginning of the next whitespace
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }

    public static void main(String[] args) {
        LengthLastWord lengthLastWord = new LengthLastWord();

        String s1 = "Hello World";
        System.out.println("Expected: 5, Actual: " + lengthLastWord.lengthOfLastWord(s1));

        String s2 = "   fly me   to   the moon  ";
        System.out.println("Expected: 4, Actual: " + lengthLastWord.lengthOfLastWord(s2));

        String s3 = "luffy is still joyboy";
        System.out.println("Expected: 6, Actual: " + lengthLastWord.lengthOfLastWord(s3));
    }
}
