/*
LEETCODE JAVA CHALLANGES: 13. ROMAN TO INTEGER (HashMap Solution)
Given a roman numeral, convert it to an integer.
*/

package in_2023_08_30;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger2 {
    public int romanToInt2(String s) {
        Map<String, Integer> romanValues = new HashMap<>();
        romanValues.put("I", 1);
        romanValues.put("IV", 4);
        romanValues.put("V", 5);
        romanValues.put("IX", 9);
        romanValues.put("X", 10);
        romanValues.put("XL", 40);
        romanValues.put("L", 50);
        romanValues.put("XC", 90);
        romanValues.put("C", 100);
        romanValues.put("CD", 400);
        romanValues.put("D", 500);
        romanValues.put("CM", 900);
        romanValues.put("M", 1000);

        int totalIntegerValue = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i+1) == 'V') {
                totalIntegerValue += romanValues.get("IV");
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'I' && s.charAt(i+1) == 'X') {
                totalIntegerValue += romanValues.get("IX");
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i+1) == 'L') {
                totalIntegerValue += romanValues.get("XL");
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'X' && s.charAt(i+1) == 'C') {
                totalIntegerValue += romanValues.get("XC");
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i+1) == 'D') {
                totalIntegerValue += romanValues.get("CD");
                i++;
            } else if (i + 1 < s.length() && s.charAt(i) == 'C' && s.charAt(i+1) == 'M') {
                totalIntegerValue += romanValues.get("CM");
                i++;
            } else {
                totalIntegerValue += romanValues.get(String.valueOf(s.charAt(i)));
            }
        }
        return totalIntegerValue;
    }

    public static void main(String[] args) {
        RomanToInteger2 RTI = new RomanToInteger2();
        String testNumeral = "LVIII";

        System.out.println(RTI.romanToInt2(testNumeral));
    }
}

