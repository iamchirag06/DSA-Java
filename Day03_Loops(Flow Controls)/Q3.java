//WAP to print the sum of first N natural numbers(when n=5)

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int i = 0;
        int n = sc.nextInt();
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("Sum is:" + sum);
        sc.close();
    }
}
