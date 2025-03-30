public class Q1 {
    public static void oddOReven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        oddOReven(12);
        oddOReven(3);
    }
}
