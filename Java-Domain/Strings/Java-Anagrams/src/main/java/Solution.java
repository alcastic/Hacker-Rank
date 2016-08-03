/**
 * Created by Alcastic on 02-08-2016.
 */

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String A, String B) {
        //Complete the function
        String copyA = A.toLowerCase();
        String copyB = B.toLowerCase();

        if (A.length() != B.length()) {
            return false;
        }
        int a;
        for (int i = 0; i < A.length(); i++) {
            copyB = copyB.replaceFirst(String.valueOf(copyA.charAt(i)), "");
            //System.out.println(copyB);
        }
        return copyB.length() == 0;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A, B);
        if (ret) System.out.println("Anagrams");
        else System.out.println("Not Anagrams");

    }
}