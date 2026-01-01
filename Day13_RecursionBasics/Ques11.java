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