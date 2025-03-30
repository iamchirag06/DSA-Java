public class Q2 {
    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {// no. of turns
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {// find minimum
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        PrintArr(arr);
    }
}
