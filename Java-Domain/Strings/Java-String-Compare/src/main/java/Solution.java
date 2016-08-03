import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String container = null;
        int k;
        String subcad;
        String minimum=null;
        String maximum=null;

        container = sc.nextLine();
        k = sc.nextInt();

        for(int i=0 ; i<=(container.length()-k) ; i++){
            subcad = container.substring(i,i+k);
            if(i==0){
                minimum = container.substring(0,k);
                maximum = minimum;
            }else if(minimum.compareTo(subcad)>0){
                minimum = subcad;
            }else if(maximum.compareTo(subcad)<0){
                maximum = subcad;
            }
        }
        System.out.println(minimum);
        System.out.println(maximum);
    }
}