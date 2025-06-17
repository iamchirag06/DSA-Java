public class Ques10 {
    // public static int optimizedPower(int x, int n) { // O(n)
    // if (n == 0) {
    // return 1;
    // }
    // int halfPowerSq = optimizedPower(x, n / 2) * optimizedPower(x, n / 2);
    // // when n is odd
    // if (n % 2 != 0) {
    // halfPowerSq = x * halfPowerSq;
    // }
    // return halfPowerSq;
    // }

    public static int optimizedPower(int x, int n) { //O(log n)
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(x, n / 2);
        int halfPowerSq = halfPower * halfPower;
        // when n is odd
        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        optimizedPower(x, n);
        System.out.println(optimizedPower(x, n));
    }

}
