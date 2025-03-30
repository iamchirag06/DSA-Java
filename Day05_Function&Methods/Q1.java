//WAP to swap two number using function
public class Q1 {
    public static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;

        System.out.println("A:"+ a);
        System.out.println("B:"+ b);
    }
    public static void main(String[] args) {
       
        int a = 10;
        int b= 5;
        swap(a,b);
       
    }
}
