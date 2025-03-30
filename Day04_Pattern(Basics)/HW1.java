// How many time Hello print??
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            for(int i =0;i<5;i++){
                System.out.println("hello");
                i+=2;
            }
        sc.close();
    }
}
