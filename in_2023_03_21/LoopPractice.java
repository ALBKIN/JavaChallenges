// LEARN JAVA / 2D ARRAYS: JAVA / Traversing 2D Arrays: Practice with Loops

package in_2023_03_21;

public class LoopPractice {
    public static void main(String[] args) {
        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        //Use nested enhanced for loops to calculate the total number of characters in the wordData 2D array and print the result to the console. (Get the string .length() of each element)
        int characterCount = 0;
        for (String[] word : wordData) {
            for (String letter : word) {
                characterCount += letter.length();
            }
            System.out.println(characterCount);
        }

        //Using nested while loops, iterate through all of the elements in the 2D array and print them to the console using the format: word [row][column]. The formatted print statement has been provided.
        int rows = 0, columns = 0;
        while (rows < wordData.length) {
            columns = 0;
            while (columns < wordData[rows].length) {
                System.out.println(wordData[rows][columns] + ": [" + rows + "]" + "[" + columns + "]");
                columns++;
            }
            rows++;
        }
    }
}
