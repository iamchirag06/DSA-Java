public class HW3 {
    public static int buyandsell_Stocks(int price[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxprofit = Math.max(profit, maxprofit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxprofit;
    }

    public static void main(String[] args) {
        int price[] = { 7, 6, 4, 3, 1 };
        System.out.println(buyandsell_Stocks(price));
    }
}
