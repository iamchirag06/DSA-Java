/*
                TILING PROBLEM
Given a "2*N" floor and Tiles of Size"2*1", count the number of ways to tle the given board using the 2*1 Tiles
(A Tile can be placed horizontal or vertical)

[AMAZON]

*/
public class Ques11 {
    public static int tilingProblem(int n){ //2*n (floor Size)
        //Base case
        if(n ==0 || n==1){
            return 1;
        }
        //kaam
        //Vertical Choice
        int fNm1 = tilingProblem(n -1);
        //Horizontal choice
        int fNm2 = tilingProblem(n -2);

        int totalWays = fNm1 + fNm2;
        return totalWays;
    }
    public static void main(String[] args){
        int n = 7;
        tilingProblem(n);
        System.out.println(tilingProblem(n));
    }
}