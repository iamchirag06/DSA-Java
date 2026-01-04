/*

        BINARY STRING PROBLEM
Print all binary Strings of size N without consecutive ones.

[PAYTM]
*/
public class Ques14 {
    public static void printBinaryStrings(int n, int lastPlace, String str) {
        // base
        if (n == 0) {
            System.out.println(str);
            return;
        }

        // kaamQ
                //LOGIC 1
        if(lastPlace == 0){
        printBinaryStrings(n-1, 0, str+"0");
        printBinaryStrings(n-1, 1, str+"1");
        }else{
        printBinaryStrings(n-1, 0, str+"0");
        }

                //lOGIC 2
        // printBinaryStrings(n - 1, 0, str+"0");
        // if (lastPlace == 0) {
        //     printBinaryStrings(n - 1, 1, str+"1");
        // }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0,"");

    }
}
