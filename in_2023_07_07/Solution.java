package in_2023_07_07;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

       Scanner scanner = new Scanner(System.in);
       System.out.println("Paste your multiple line test input here: ");

       int lineCounter = 1;
       while (scanner.hasNext()) {
           String line = scanner.nextLine();
           System.out.println(lineCounter + " " + line);
           lineCounter++;
       }
    }
}
