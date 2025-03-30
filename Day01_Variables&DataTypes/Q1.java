
// In a program, input 3 number: A,B,C. you have to output the Average of these 3 number
import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A:");
        int a = sc.nextInt();
        System.out.print("Enter B:");
        int b = sc.nextInt();
        System.out.print("Enter C:");
        int c = sc.nextInt();

        int Avg = (a+b+c)/3;
        System.out.println(Avg);
        sc.close();
    }
    
}
