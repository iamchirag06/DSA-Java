/*
For a Given Integer array of Size N. you have to find all the occurences(indices) of a given element
(key) and print them. Use a  Recursive functon to solve this Problem.

INPUT: arr[]={3,2,4,5,6,2,7,2,2}, key = 2
OUTPUT: 1 5 7 8

*/
public class PracticeQues1 {
    public static void findIndex(int key,int arr[],int idx) {
        //Base Case
        if(idx==arr.length){
            return;
        }

        //kaam
        if(key==arr[idx]){
            System.out.print(idx+" ");
            findIndex(key, arr, idx+1);
        }else{
            findIndex(key, arr, idx+1);
        }
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,6,2,7,2,2};
        int key = 2;

        findIndex(key, arr, 0);
    }
}
