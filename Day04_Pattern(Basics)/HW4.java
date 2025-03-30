// WAP to print the multiplication table of a number N,entered by user

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N:");
        int num = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
        sc.close();
    }
}
