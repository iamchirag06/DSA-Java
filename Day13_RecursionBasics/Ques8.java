//WAF to find the Last Occurence of an element in an array 
public class Ques8 {
    public static int LastOccur(int arr[], int i, int key) {
        if(i == arr.length){ //base case
            return -1;
        }
        //Look Forward
        int isFound = LastOccur(arr, i+1, key);
        if(isFound != -1){
            return isFound;
        }
        //Check with itSelf
        if(arr[i] == key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5,3};
        int key = 5;

        if (LastOccur(arr, 0, key) == -1) {
            System.out.println("Key is  not Found");
        } else {
            System.out.println("Key is Found at Index:" + LastOccur(arr, 0, key));
        }
    }
}

