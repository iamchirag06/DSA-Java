import java.util.Scanner;

public class Array_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];

        marks[0]=sc.nextInt();//phy
        marks[1]=sc.nextInt();//chem
        marks[2]=sc.nextInt();//maths

        System.out.println("Phy : "+marks[0]);
        System.out.println("Chem : "+marks[1]);
        System.out.println("Math : "+marks[2]);

        // System.out.println("Length Of Array : "+marks.length);

        sc.close();
    }
}
