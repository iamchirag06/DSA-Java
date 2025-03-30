import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("Number is Neither Prime Nor Composite");
        }else if (n == 2) {
            System.out.println("Number is Prime");
        } else {
            boolean isprime = true;
            // for (int i = 2; i <= n-1; i++) {   //May be wrong in large value of N
                for (int i =2; i<=Math.sqrt(n);i++){ //for code Optimisation (when N is in Lakhs)
                if (n % i == 0) {
                    isprime = false;
                }
            }
            if (isprime) {
                System.out.println("Number Is Prime");
            } else {
                System.out.println("Number is not prime");
            }
        }

        sc.close();
    }
}
