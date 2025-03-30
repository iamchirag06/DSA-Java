import java.util.*;
public class UnaryArithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Pre Increment
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);
        
        //Post Increment
        int c = 10;
        int d = c++;
        System.out.println(c);
        System.out.println(d);


        int e = 10;
        int f = e--;
        System.out.println(e);
        System.out.println(f);
        
        int g = 10;
        int h = --g;
        System.out.println(g);
        System.out.println(h);
        sc.close();
    }
}
