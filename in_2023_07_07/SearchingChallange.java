package in_2023_07_07;

/* Determine which word has the greatest number of repeated letters. Have the function SearchingChallange(str) take the
 string parameter being passed and return the first word with the t = greatest number of repeated letters. For example:
 "Today, is the greatest day ever!" should return greatest because it has 2 "e" and it comes before "ever" which also
 has to "e". If there are no words with repeating letters return -1. Words will be separated by spaces.
 Once the function is working take the final output string and concentrate it with your ChallangeToken and then replace
  every third character with an X. Your ChallangeToken: 2c9tkuv0df5
 */

import java.util.Arrays;

public class SearchingChallange {
    private static final String CHALLANGE_TOKEN = "2c9tkuv0df5";

    public String word;

    public static String searchWordWithMostLetters(String string) {
        // split the string into words
        String[] words = string.split(" ");
        // variable counting the most repeated letters in a word
        int maxRepeated = 0;
        String result = "-1";
        System.out.println("Separated input sentence to compare words is: " + Arrays.toString(words));

        for (String word : words) {
            int[] repeatedLetters = new int[word.length()];
            char[] letters = word.toCharArray();

            for (int i = 0; i < letters.length -1; i++) {
                for (int j = i + 1; j < letters.length; j++) {
                    if (letters[i] == letters[j]) {
                        repeatedLetters[i]++;
                    }
                }
            }
            int maxCount = 0;
            for (int count : repeatedLetters) {
                if (count > maxCount) {
                    maxCount = count;
                }
            }
            if (maxCount > maxRepeated) {
                maxRepeated = maxCount;
                result = word;
            }
        }
        return result;
    }

    public static String concentateWithChallangeToken(String word) {
        return word.concat(CHALLANGE_TOKEN);
    }

    public static String replaceEveryThirdCharacter(String string) {
        char[] chars = string.toCharArray();
        for (int i = 2; i < chars.length; i +=3) {
            chars[i] = 'X';
        }
        return String.valueOf(chars);
    }
public static void main(String[] args) {
        String sentence = "Today, is the greatest day ever";
        String output = searchWordWithMostLetters(sentence);
        System.out.println(output);
        String finalOutput = concentateWithChallangeToken(output);
        String modifiedFinalOutput = replaceEveryThirdCharacter(finalOutput);
        System.out.println(finalOutput);
        System.out.println(modifiedFinalOutput);

    }
}



