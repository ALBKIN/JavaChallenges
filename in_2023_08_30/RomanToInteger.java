/*
LEETCODE JAVA CHALLANGES: 13. ROMAN TO INTEGER (switch case solution)
Given a roman numeral, convert it to an integer.
*/

package in_2023_08_30;

public class RomanToInteger {
    public int romanToInt(String s) {

        int answer = 0, number = 0, previous = 0;

        // iterate backwards through input
        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M': number = 1000; break;
                case 'D': number = 500; break;
                case 'C': number = 100; break;
                case 'L': number = 50; break;
                case 'X': number = 10; break;
                case 'V': number = 5; break;
                case 'I': number = 1; break;
            }
            // check if we encountered double roman numeral
            if (number < previous) {
                answer -= number;
            }
            else {
                answer += number;
            }
            previous = number;
        }
        return answer;
    }
}

    public static void main(String[] args) {
        RomanToInteger test = new RomanToInteger();
        String testNumeral = "LVIII";
        System.out.println("Converted to HUMANLY UNDERSTANDABLE number is: " + test.romanToInt(testNumeral));
    }
}
