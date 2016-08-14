import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by alcastic on 14-08-16.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();

        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);

        System.out.println(sum);
        System.out.println(mul);
    }
}
