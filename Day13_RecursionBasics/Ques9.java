public class Ques9 {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }

        // int xNm1 = power(x,n-1);
        // int xN = x * xNm1;
        // return xN;
        return x * power(x,n-1);
    }
    public static void main(String[] args) {
        int n = 10;
        int x = 2;
        power(n, x);
        System.out.println(power(x, n));
    }
}
