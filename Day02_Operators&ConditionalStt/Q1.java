//input two no. from user and given following condition
//a=b (equal)
//a>b (a is greater)
//a<b (a  is lesser)

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is greater");
        } else {
            System.out.println("A is lesser");
        }
        sc.close();
    }
}
