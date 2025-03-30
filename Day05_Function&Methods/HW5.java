//Write a Java method to compute the sum of the digits of an integer
public class HW5 {
    public static void SumDigit(int num){
        int sum =0;
        while(num!=0){
            int lastdigit=num%10;
            sum = sum + lastdigit;
            num=num/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        SumDigit(123);
    }
}
