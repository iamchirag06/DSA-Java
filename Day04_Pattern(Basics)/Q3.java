//Print HALF PYRAMID pattern
//1
//12
//123
//1234


public class Q3 {
    public static void main(String[] args) {
        int n = 4;//no of lines
        for(int line =1 ; line <= n; line++){
            for(int num = 1 ; num <= line;num ++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
