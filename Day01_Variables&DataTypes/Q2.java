//In  a program input the side of square .You have to output the area of the Square
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square:");
        int side = sc.nextInt();

        int area = side * side ;
        System.out.print("Area:");
        System.out.print(area);
        sc.close();
    }
    
}
