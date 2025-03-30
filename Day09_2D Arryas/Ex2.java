import java.util.Scanner;

public class Ex2 {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key is found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;
    }
    public static void largest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(largest<matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest Element is :"+ largest);
    }
    public static void smallest(int matrix[][]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Smallest Element is :"+ smallest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
       
        search(matrix, 5);
        largest(matrix);
        smallest(matrix);
        sc.close();
    }
}
