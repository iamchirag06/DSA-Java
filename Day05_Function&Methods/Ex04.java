// Function Overloading Using Data Types
public class Ex04 {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3.14f, 21.32f));
        System.out.println(sum(8, 7));
    }
    
    
}
