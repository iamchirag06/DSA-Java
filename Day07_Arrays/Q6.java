public class Q6 {
    public static void printSubarrays(int number[]){
        int ts =0;
        for(int i=0;i<number.length;i++){
            int start =i;
            for(int  j=i;j<number.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){ // print
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArrays : " +ts);
    }
    public static void main(String[] args){
        int numbers[]={2,4,6,8,10};
        printSubarrays(numbers);
    }
}
