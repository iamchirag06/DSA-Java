// Print Sum Of First N Natural Numbers
public class Ques4 {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sNm1 = sum(n-1);
        int sN = n + sNm1;
        return sN;
    }

    public static void main(String[] args) {
        int n = 5;
        sum(n);
        System.out.println(sum(n));
    }

}