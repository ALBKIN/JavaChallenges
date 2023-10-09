/*
        LEETCODE JAVA CHALLENGES: 28. Find the Index of the First Occurrence in a String
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:
Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:
Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.

 */

package in_2023_10_09;

public class IndexFirstOccurance {
    public int strStr(String haystack, String needle) {
        // return haystack.indexOf(needle); EASIEST ONE-LINE SOLUTION

        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || haystack.length() < needle.length()) return -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        IndexFirstOccurance indexFirstOccurance = new IndexFirstOccurance();

        String haystack1 ="sadbutsad";
        String needle1 = "sad";
        System.out.println("Expected: 0, Actual: " + indexFirstOccurance.strStr(haystack1, needle1));

        String haystack2 = "leetcode";
        String needle2 = "leeto";
        System.out.println("Expected: -1, Actual: " + indexFirstOccurance.strStr(haystack2, needle2));
    }
}
