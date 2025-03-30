// WAP that reads a set of integers and then prints the sum of the even and odd integers

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sumeven = 0;
        int sumodd = 0;
        int choice;
        do{
            System.out.print("Enter Number:");
            int num = sc.nextInt();

            if(num%2==0){
                sumeven = sumeven +num;
            }else{
                sumodd = sumodd +num;
            }
           System.out.print("Do you want to continue? If Yes Enter 1 and If No Enter 0 : ");
        choice = sc.nextInt();
        }while(choice  ==1);
        System.out.println("Sum of Even Inputv :" + sumeven);
        System.out.println("Sum of Odd Input :" + sumodd);
        sc.close();
    }
    
}

