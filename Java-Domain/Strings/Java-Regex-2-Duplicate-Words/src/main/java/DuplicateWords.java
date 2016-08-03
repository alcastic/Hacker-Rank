/**
 * Created by Alcastic on 03-08-2016.
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {
    public static void main(String[] args) {

        String pattern = "(^|\\s)([\\S]+)\\s\\2(\\s|$)";
        Pattern r = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1) + m.group(2) + m.group(3));
                m = r.matcher(input);
            }
            System.out.println(input);
            testCases--;
        }
    }
}