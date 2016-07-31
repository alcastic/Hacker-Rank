/**
 * Created by Alcastic on 31-07-2016.
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        sc.nextLine();

        String test;
        StringTokenizer tokens;

        int a, b, n, ans;

        for (int i = 0; i < t; i++) {
            test = sc.nextLine();
            tokens = new StringTokenizer(test);
            a = Integer.parseInt(tokens.nextToken());
            b = Integer.parseInt(tokens.nextToken());
            n = Integer.parseInt(tokens.nextToken());

            ans = a;

            for (int j = 0; j < n; j++) {
                ans += b * Math.pow(2, j);
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}