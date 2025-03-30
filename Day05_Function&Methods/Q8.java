// Convert Decimal to Binary(n=7)
public class Q8 {
    public static void decToBin(int decNum) {
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary Form of " + myNum + " : " + binNum);
    }

    public static void main(String[] args) {
        decToBin(7);
    }
}