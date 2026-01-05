/*
You are given a number (2019), convert it into a string of english like
"two zero one nine ". Use a recursive function to solve this problem

NOTE: The digit of number will only be in the range of 0-9
& the lastDigit of a Number can't be 0

INPUT: 2019
OUTPUT: two zero one nine

*/
public class PracticeQues2 {

    public static void printDigits(int num, String digits[]){
        //base
        if(num==0){
            return;
        }

        //kaam
        int lastDigit = num %10; 
        printDigits(num/10, digits); //inner call
        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {
        int num = 2019;
        String digits[]={
            "zero","one","two","three","four","five","six","seven","eight","nine"
        };

        printDigits(num, digits);
    }
}
