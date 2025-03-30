import java.util.Scanner;

public class Q5 {
    public static void printPairs(int numbers[]) {
        int tp=0;//Total pairs 
        for (int i = 0; i < numbers.length; i++) {
            
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : "+ tp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numbers[] = new int [5];

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        printPairs(numbers);
        sc.close();
    }
}
