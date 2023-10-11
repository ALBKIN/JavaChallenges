/*
HACKERRANK JAVA CHALLENGES: The Calendar
Calendar is an abstract class that provides methods for converting between a specific instant in time and a set of calendar
fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method, which returns the day on that date. To simplify your task, we have provided a portion of the code in the editor.

Sample Input 08 05 2015  Sample Output WEDNESDAY
Constrains year 2000-3000
 */

package in_2023_10_11;

import java.time.LocalDate;

public class Calendar {

    public static String findDay(int month, int day, int year) {
        // Create a LocalDate object with the given month, day, and year
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week and convert it to uppercase
        return date.getDayOfWeek().toString();
    }

    public static void main(String[] args) {
        System.out.println(findDay(8, 5, 2015)); // Outputs WEDNESDAY
    }
}
