import java.util.*;
public class BinaryArithmatic {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in) ;

        int a =10;
        int b =5;
        System.out.println("ADD:" + (a+b));
        System.out.println("Subtract:" + (a-b));
        System.out.println("Product:" + (a*b));
        System.out.println("Divide:" + (a/b));
        System.out.println("Modulo:" + (a%b));

       sc.close();
    }
}
