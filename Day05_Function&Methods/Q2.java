// WAP to find product of a and b (a=3,b=5)
public class Q2 {
    public static int multiply(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int product = multiply(a, b);
        System.out.println("a*b:" + product);
    }
}
