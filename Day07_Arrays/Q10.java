//DSA Sheet Ques 22 Trapping RainWater 

import java.util.Scanner;

public class Q10 {
    public static void trappedRainwater(int height[]){
        int n = height.length;
        //Calculate left max Boundary
        int leftMax[]= new int[n];
        leftMax[0]=height[0];
        for(int i =1;i<n;i++){
            leftMax[i]= Math.max(height[i],leftMax[i-1]);
        }
        //Calculate right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int trappedWater =0;
        //loop
        for(int i=0;i<n;i++){
            //Water level = min(left max bound,right max bound)
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            //trapped water = water level - height[i]
            trappedWater += waterlevel-height[i];
        }
        System.out.println(trappedWater);
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height[]={4,2,0,6,3,2,5};
        trappedRainwater(height);
        sc.close();
    }
}
