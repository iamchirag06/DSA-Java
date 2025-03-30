//Display All number entered by user except multiples of 10
import java.util.Scanner;

public class Q8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your Number:");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("Number was:" + n);
        } while (true);
    }
}
