// Wrte a java method to compute the average of three numbers

import java.util.Scanner;

public class HW1 {
    public static int average(int num1,int num2,int num3){
        int avg = (num1+num2+num3)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number 1:");
        int num1= sc.nextInt();
        System.out.print("Enter Number 2:");
        int num2= sc.nextInt();
        System.out.print("Enter Number 3:");
        int num3= sc.nextInt();

        System.out.println(average(num1, num2, num3));
        sc.close();
    }
}
