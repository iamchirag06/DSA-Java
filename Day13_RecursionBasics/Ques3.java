//Print Factorial of a Number
public class Ques3 {
    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fNm1 = fact(n - 1);
        int fN = n * fNm1;
        return fN;
    }

    public static void main(String[] args) {
        int n = 5;
        fact(n);

        System.out.println(fact(n));
    }

}
