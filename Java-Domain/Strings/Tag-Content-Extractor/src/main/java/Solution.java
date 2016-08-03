import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String line = in.nextLine();
            int math = 0;
            Pattern r = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                if (m.group(2).length() != 0) {
                    System.out.println(String.valueOf(m.group(2)));
                    math++;
                }
            }
            if (math == 0) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}