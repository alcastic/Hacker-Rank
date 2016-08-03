/**
 * Created by Alcastic on 03-08-2016.
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //Complete the code
        StringTokenizer stk = new StringTokenizer(s, " !,?._'@\".");
        System.out.println(stk.countTokens());
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken());
        }

    }
}