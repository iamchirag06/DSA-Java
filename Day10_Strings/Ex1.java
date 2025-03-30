import java.util.Scanner;

public class Ex1{
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str ;
    str = sc.nextLine();
    System.out.println(str.charAt(2));
    System.out.print(str.length()+ "\n");
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
    }
    sc.close();
}
}