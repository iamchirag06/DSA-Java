public class HW3 {
    public static void transpose(int matrix[][]){
        //Print matrix
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
               System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //Transpose
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                transpose[i][j]=matrix[j][i];
            }
        }
        System.out.println();
        
        //Print Transpose
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int matrix[][]={{11,12,13},{21,22,23}};
        transpose(matrix);
    }
}
