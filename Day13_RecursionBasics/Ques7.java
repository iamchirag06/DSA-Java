//WAF to find the first Occurence of an element in an array 
public class Ques7 {
    public static int firstOccur(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccur(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;

        if (firstOccur(arr, 0, key) == -1) {
            System.out.println("Key is  not Found");
        } else {
            System.out.println("Key is Found at Index:" + firstOccur(arr, 0, key));
        }
    }

}