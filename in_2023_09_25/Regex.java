// JAVA REGULAR EXPRESSIONS EXERCISE

package in_2023_09_25;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public Regex() {
    }
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("gr[AE]y", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Vibrant light bloomed across the gray sky, illuminating its grey haze" +
                " in flashes amidst rolling hills of wispy gray clouds. Colors of gold, pink, and purple painted the " +
                "horizon, the dull grey of the sky overtaken by brief moments of a quiet twilight storm.");

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        System.out.println(counter);
    }
}