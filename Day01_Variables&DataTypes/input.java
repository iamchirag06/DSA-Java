import java.util.Scanner;
public class input {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        System.out.println(input);

        int number = s.nextInt();
        System.out.println(number);
    
        float date = s.nextFloat();
        System.out.println(date);

        s.close();
    }
}
