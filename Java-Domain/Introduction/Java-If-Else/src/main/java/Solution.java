/**
 * Created by Alcastic on 31-07-2016.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else if (n > 1 && n < 6) {
            ans = "Not Weird";
        } else if (n > 5 && n < 21) {
            ans = "Weird";
        } else if (n > 20) {
            ans = "Not Weird";
        }
        System.out.println(ans);

    }
}