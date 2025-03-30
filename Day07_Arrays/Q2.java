import java.util.*;
public class Q2 {
    public static void LargestNumber(int Number[]){
        int largest =Integer.MIN_VALUE;
        int Smallest =Integer.MAX_VALUE;
        
        for(int i=0;i<Number.length;i++){
            if(largest<Number[i]){
                largest = Number[i];
            }
            if(Number[i]<Smallest){
                Smallest = Number[i];
            }
        }
        System.out.println("Smallest Value is :"+Smallest);
        System.out.println("Largest Value is :"+largest);
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number[]={1,2,6,3,5};

        LargestNumber(Number);
        sc.close();
    }
    
}
