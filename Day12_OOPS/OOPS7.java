// Method overLoading (COMPILE TIME POLYMORPHISM)
public class OOPS7 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum((float)1.5,(float)2.8));
        System.out.println(calc.sum(1,2,7));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
