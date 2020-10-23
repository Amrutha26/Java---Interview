/* Abstract classes cannot be instantiated but can be subclassed.

The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, 
HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

https://docs.oracle.com/javase/7/docs/api/java/util/Calendar.html

New feature in Java 8: import java.time.LocalDate;

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */
       
    public static String findDay(int month, int day, int year) {

        String[] dayOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", 
        "FRIDAY", "SATURDAY"};

        //Creating a calendar
        Calendar cal = Calendar.getInstance();

        /*Set default values: month-1 because the months are indexed from 0 in 
        Calendar class */
        cal.set(year, month - 1,day);

        int p = cal.get(Calendar.DAY_OF_WEEK);

        return dayOfWeek[p-1];
    }
    

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
