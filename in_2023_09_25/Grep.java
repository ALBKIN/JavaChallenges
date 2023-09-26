package in_2023_09_25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Grep {

    public static void main(String[] args) {

        String fileName;
        File file;
        Scanner sc;

        for (int fileNumber = 1; fileNumber <= 5; fileNumber++) {
            fileName = "TestFile" + fileNumber + ".txt";
            try {
                file = new File(fileName);
                sc = new Scanner(file);
            } catch (FileNotFoundException e) {
                System.out.println("Problem opening file " + fileName);
                e.printStackTrace();
                return;
            }

            Pattern pattern = Pattern.compile("\\d+");
            String line;
            Matcher matcher;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                matcher = pattern.matcher(line);
                if (matcher.find()) {
                    System.out.println(fileName + ": " + line);
                }
            }

            sc.close(); // Close the scanner after reading the file
        }
    }
}
