//Print CHARACTER pattern
//A
//BC
//DEF
//GHIJ

public class Q4 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int CHARACTER = 1; CHARACTER <= line; CHARACTER++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
