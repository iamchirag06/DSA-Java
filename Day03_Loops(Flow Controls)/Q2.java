//WAP to  print number from 1 to n (n=7)

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 1;
        int range = sc.nextInt();

        while(counter<=range){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        sc.close();
    }
    
}
