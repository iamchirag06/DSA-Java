// Print Numbers from 1 to N (Increasing order)
public class Ques2 {
    public static void printInc(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }
    public static void main(String[] args) {
        int n=5;
        printInc(n);
    }
}
