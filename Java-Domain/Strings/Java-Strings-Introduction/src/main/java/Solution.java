import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum = A.length() + B.length();
        String lex = A.compareTo(B) <= 0 ? "No" : "Yes";
        String cap = String.valueOf(A.charAt(0)).toUpperCase() + A.substring(1) + " " + String.valueOf(B.charAt(0)).toUpperCase() + B.substring(1);
        System.out.println(sum);
        System.out.println(lex);
        System.out.println(cap);

    }
}