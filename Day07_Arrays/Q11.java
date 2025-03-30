public class Q11 {
    public static int buyAndSellStocks(int price[]){
        int buyPrice =Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i =0 ;i<price.length;i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit =Math.max(profit,maxProfit);
            }else{
                buyPrice=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.print(buyAndSellStocks(price));
    }
}
