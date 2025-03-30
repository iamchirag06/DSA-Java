
public class Q1 {
    public static void Hollow_rectangle(int rows,int columns){
        //outer loop
        for(int i=1;i<=rows;i++){
            //inner loop
            for(int j=1;j<=columns;j++){
                //boundary conditions
                if(i==1||i==rows||j==1||j==columns){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Hollow_rectangle(5,5);
}
}
