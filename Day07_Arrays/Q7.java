public class Q7 {
    public static void maxSubarrays_SUM(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {
                    // SubArray Sum
                    currSum = currSum + number[k];
                    System.out.print(number[k] + "  ");
                }
                System.out.println("Sum:" + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max sum: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSubarrays_SUM(numbers);
    }
}
