import java.util.Scanner;

public class HW1 {
    public static boolean nums(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,1};
        System.out.println(nums(arr));
        sc.close();
    }
}
