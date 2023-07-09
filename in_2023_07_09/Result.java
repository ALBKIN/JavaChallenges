package in_2023_07_09;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {

        // Split the encrypted message into words
        List<String> words = Arrays.asList(encryptedMessage.split(" "));

        // Reverse the words in the message
        Collections.reverse(words);

        // Initialize an empty list to hold the decrypted words
        List<String> decryptedWords = new ArrayList<>();

        // For each word in the reversed list of words
        for (String word : words) {
            // Initialize an empty string to hold the decrypted word
            StringBuilder decryptedWord = new StringBuilder();

            // Initialize a variable to hold the current character we're decompressing
            char currentChar = '\0';

            // For each character in the word
            for (char c : word.toCharArray()) {
                // If the character is a digit
                if (Character.isDigit(c)) {
                    // Multiply the current character by the digit and add it to the decrypted word
                    decryptedWord.append(String.valueOf(currentChar).repeat(Character.getNumericValue(c)));
                    // Reset the current character
                    currentChar = '\0';
                } else {
                    // If the current character is not empty, add it to the decrypted word
                    if (currentChar != '\0') {
                        decryptedWord.append(currentChar);
                    }
                    // Set the current character to the character we're currently at
                    currentChar = c;
                }
            }

            // If the current character is not empty, add it to the decrypted word
            if (currentChar != '\0') {
                decryptedWord.append(currentChar);
            }

            // Add the decrypted word to the list of decrypted words
            decryptedWords.add(decryptedWord.toString());
        }

        // Join the decrypted words with spaces to form the decrypted message and return it
        return String.join(" ", decryptedWords);
    }
}