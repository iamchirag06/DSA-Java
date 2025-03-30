//Wap to reverse the given number(n  = 10899)

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev = 0;
        int n = sc.nextInt();
        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10)+ lastDigit;
            n=n/10;
        }
        System.out.println(rev);
        sc.close();
    }
}
