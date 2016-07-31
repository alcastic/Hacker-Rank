/**
 * Created by Alcastic on 31-07-2016.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        while (sc.hasNext()) {
            cont += 1;
            System.out.printf("%d %s%n", cont, sc.nextLine());
        }
    }
}