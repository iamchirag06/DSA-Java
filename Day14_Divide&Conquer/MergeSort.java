public class MergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }

    public static void mergeSort(int arr[], int si, int ei){
        //base
        if(si >= ei){
            return;
        }
        //kaam
        //Find Mid of array
        int mid = (si+ei)/2; // (ei+si)/2

        mergeSort(arr, si, mid); //Left part
        mergeSort(arr, mid+1, ei); //Right part

        merge(arr,si,mid,ei); //Merge Both Part
    }

    public static void merge(int arr[],int si,int mid,int ei){
        // left(0,3)=4 right(4,6)=3  -> 6-0+1 = 7
        int temp[] = new int[ei-si+1];  // +1 because of zero based indexing
        int i = si; //iterator for left part
        int j = mid+1; // iterator for right part
        int k = 0; // iterator for temp arr 

        while(i<= mid && j <= ei){
            if(arr[i]< arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        //left part for LeftOver Elements
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part for LeftOver Elements
        while(j<=ei){
            temp[k++]=arr[j++];
        }

        //copy temp to original arr
        for(k=0,i=si;k<temp.length;k++,i++){
             arr[i]=temp[k]; 
        }
    }

    public static void main(String[] args) {
        int arr[] ={6,3,9,5,2,8};

       mergeSort(arr, 0, arr.length-1);
       printArr(arr);
    }
}
