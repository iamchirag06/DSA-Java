//WAP to check if a number is palindrone n java?
public class HW3 {
    public static void pallindrone(int num){
            if(num == reverse(num)){
                System.out.println("Number is Pallindrone");
            }else{
                System.out.println("Number is Not pallindrone");
            }
    }

    public static int reverse(int n){
        int rev =0;
        while(n!=0){
            int lastdigit=n%10;
            rev =(rev*10) + lastdigit;
            n=n/10;
         }
         return rev;
    }
    public static void main(String[] args) {
        pallindrone(1231);
    }
}
