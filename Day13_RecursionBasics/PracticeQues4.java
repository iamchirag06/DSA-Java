public class PracticeQues4 {

    // recursive function
    public static int countSubstrings(String str, int i, int j) {

        // base case: start index end ke bahar chala gaya
        if (i == str.length()) {
            return 0;
        }
        // base case: end index end tak pahunch gaya
        if (j == str.length()) {
            return countSubstrings(str, i + 1, i + 1);
        }

        int count = 0;

        // check start and end character
        if (str.charAt(i) == str.charAt(j)) {
            count = 1;
        }

        // move end index forward
        return count + countSubstrings(str, i, j + 1);
    }

    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(countSubstrings(str, 0, 0)); // 7
    }
}
