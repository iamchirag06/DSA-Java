//write a method name iseven that accepts an int argument. The method should return
// true if the argument is even or false otherwise. Also WAP to test your method

import java.util.Scanner;

public class HW2 {
    public static boolean iseven(int n){
        if(n%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number:");
        int num = sc.nextInt();

        if(iseven(num)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        sc.close();
    }
}
