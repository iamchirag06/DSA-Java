import java.util.*;
public class Practice {
    // public static int linearSearch(int number[],int key){
    //     for(int i=0;i<number.length;i++){
    //         if(number[i]==key){
    //                 return i;
    //         }
    //     }
    //     return -1;
    // }

    // public static void LargestNumber(int number[]){
    //     int largest =Integer.MIN_VALUE;
    //     for(int i =0; i<number.length;i++){
    //         if(largest<number[i]){
    //             largest=number[i]; 
    //         }
    //     }
    //     System.out.println("Largest Number in the Array is :"+largest);
    // }

    // public static int BinarySearch(int number[],int key){
    //     int start =0;
    //     int end = number.length -1;
    //     while(start<=end){
    //         int mid =(start+end)/2;
    //         if(number[mid]==key){
    //             return mid;
    //         }
    //         if(number[mid]<key){
    //             start = mid+1;
    //         }else{
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }

    // public static void ReverseArray(int number[]){
    //     int first =0;
    //     int last = number.length -1;
    //     while(first<last){
    //         int temp = number[first];
    //         number[first]=number[last];
    //         number[last]=temp;
    //         first++;
    //         last--;
    //     }
    // }

    // public static void pairsArray(int number[]){
    //     int tp =0;
    //     for(int i=0;i<number.length;i++){
    //         int current = number[i];
    //         for(int j=i+1;j<number.length;j++){
    //             System.out.print("("+current+","+number[j]+") ");
    //             tp++;
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total Pairs :" +tp);
    // }

    // public static void printSubarrays(int number[]){
    //     int ts=0;
    //     for(int i=0;i<number.length;i++){
    //         int start =i;
    //         for(int j=i;j<number.length;j++){
    //             int end =j;
    //             for(int k=start;k<=end;k++){
    //                 System.out.print(number[k]+" ");
    //             }
    //             ts++;
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Total Pairs :"+ts);
    // }

    // public static void MaxSubarray(int number[]){
    //     int currSum =0;
    //     int maxSum = Integer.MIN_VALUE;

    //     for(int i=0;i<number.length;i++){
    //         int start=i;
    //         for(int j =i;j<number.length;j++){
    //             int end =j;
    //             currSum=0;
    //             for(int k=start;k<=end;k++){
    //                 currSum+=number[k];
    //                 System.out.print(number[k]+" ");
    //             }
    //             System.out.print("sum :"+currSum);
    //             if(maxSum<currSum){
    //                 maxSum=currSum;
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    //     System.out.println("Max Sum :"+maxSum);
    // }

    public static void maxSubarray_prefixSUM(int number[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        //PREFIX ARRAY FORMATION
        int prefix[] = new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        //
        for(int i=0;i<number.length;i++){ 
            int start =i;
            for(int j=i;j<number.length;j++){
                int end =j;
                currSum = start ==0?prefix[end] : prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Max Sum : "+maxSum);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[]={1,-4,6,2,-3};
        // int key = 124;

        // int search = linearSearch(number,key);
        // if(search== -1){
        //     System.out.println("Key not Found");
        // }else{
        //     System.out.println("Key is found At Index :"+search);
        // }
        
        // LargestNumber(number);

        // int search = BinarySearch(number, key);
        // if(search == -1){
        //     System.out.println("Key Not Found");
        // }else{
        //     System.out.println("Key is found at Index : "+search);
        // }

        // ReverseArray(number);
        // for(int i=0;i<number.length;i++){
        //     System.out.print(number[i]+" ");
        // }
        // System.out.println();

        // pairsArray(number);

        // printSubarrays(number);

        // MaxSubarray(number);

        maxSubarray_prefixSUM(number);
        sc.close();
        }
}
