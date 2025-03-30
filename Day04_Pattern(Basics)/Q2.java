//Print Invereted Star pattern 
// ****
// ***
// **
// *


public class Q2 {
    public static void main(String[] args) {
        int n =4;//no of lines
        for(int line = 1;line<=n;line++){
            for(int star =1;star<=(n-line+1);star++){ //n-i-1
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
