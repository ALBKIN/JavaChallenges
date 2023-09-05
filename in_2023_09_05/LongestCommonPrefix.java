/*
        LEETCODE JAVA CHALLANGES: 114. LONGEST COMMON PREFIX

       Write a function to find the longest common prefix string amongst an array of strings.
       If there is no common prefix, return an empty string ""

       Example 1:
       Input: strs = ["flower","flow","flight"]
       Output: "fl"

       Example 2:
       Input: strs = ["dog","racecar","car"]
       Output: ""
       Explanation: There is no common prefix among the input strings.
*/

package in_2023_09_05;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        // If the array is empty return an empty string
        if (strs.length == 0) {
            return "";
        }

        // Start with the first string as the prefix candidate
        String prefix = strs[0];

        // Loop through the array to compare each string with the prefix
        for (int i = 0; i < strs.length; i++) {
            // While the prefix doesn't exist in the string at strs[i] shorten the prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // If we've run out of prefix to check, return ""
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Common prefix: " + longestCommonPrefix(strs1));  // Should print "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Common prefix: " + longestCommonPrefix(strs2));  // Should print ""
    }
}