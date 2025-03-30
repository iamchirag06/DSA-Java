import java.util.Scanner;
public class areaofcrcle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Radius:");
        float radius = sc.nextFloat();

        float Area = 3.14f * radius * radius;
        System.out.println(Area);

        sc.close();
    }
}
