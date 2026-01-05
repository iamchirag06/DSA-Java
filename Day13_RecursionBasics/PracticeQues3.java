//WAP to find the length of a String using Recursion
public class PracticeQues3 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Length = " + length(str));
    }
    public static int length(String str) {
        // base case
        if (str.length() == 0) {
            return 0;
        }

        // recursive work
        return 1 + length(str.substring(1));
    }
}
