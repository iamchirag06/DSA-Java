// WAp to print all primes in a range
public class Q6 {

    public static void PrimeinRange(int n){
        for(int i =2 ;i<=n;i++){
            if(isprime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

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
        PrimeinRange(10);
    }
}
