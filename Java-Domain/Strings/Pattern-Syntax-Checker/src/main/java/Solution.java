/**
 * Created by Alcastic on 03-08-2016.
 */

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String result = "";
        while (testCases > 0) {
            String pattern = in.nextLine();
            result = "Valid";
            try {
                Pattern.compile(pattern);
            } catch (PatternSyntaxException ex) {
                result = "Invalid";
            } finally {
                System.out.println(result);
            }
        }
    }
}