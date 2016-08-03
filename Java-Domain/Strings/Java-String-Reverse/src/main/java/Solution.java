/**
 * Created by Alcastic on 02-08-2016.
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A=sc.next();

        /* Enter your code here. Print output to STDOUT. */
        boolean palindrome = true;

        for(int i=0 ; i<(A.length()/2) ; i++){
            if(A.charAt(i) != A.charAt(A.length()-(1+i))){
                palindrome = false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}