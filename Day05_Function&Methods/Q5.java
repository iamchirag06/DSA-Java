//WAP to check a number is prime or not
import java.util.Scanner;

public class Q5 {
    public static boolean isprime(int n) {
        boolean isprime = true;
        if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isprime = false;
                }
            }
            return isprime;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = sc.nextInt();
        System.out.println(isprime(num));
        sc.close();
    }
}
