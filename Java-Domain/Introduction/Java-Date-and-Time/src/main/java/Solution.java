import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by alcastic on 13-08-16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = "8";
        String day = "5";
        String year = "2015";

        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String response = "";

        switch (dayOfWeek) {
            case 1:
                response = "SUNDAY";
                break;
            case 2:
                response = "MONDAY";
                break;
            case 3:
                response = "TUESDAY";
                break;
            case 4:
                response = "WEDNESDAY";
                break;
            case 5:
                response = "THURSDAY";
                break;
            case 6:
                response = "FRIDAY";
                break;
            case 7:
                response = "SATURDAY";
                break;

        }
        System.out.print(response);
    }
}
