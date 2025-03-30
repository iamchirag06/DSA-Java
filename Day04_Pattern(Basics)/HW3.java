// WAP to find factorial of any number entered by user

import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number:");
        int num = sc.nextInt();// to hold number

        int fact = 1;// to hold factorial

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        //For Print 
        System.out.println("Factorial is:" + fact);

        sc.close();
    }
}
