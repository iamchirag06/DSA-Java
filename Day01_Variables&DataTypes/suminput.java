import java.util.Scanner;
public class suminput {
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the value of a:");
     int a = sc.nextInt();
     System.out.print("Enter the value of b:");
     int b = sc.nextInt();

     float sum;
     sum = a+b;
     System.out.println(sum);

     sc.close();
    }
}
