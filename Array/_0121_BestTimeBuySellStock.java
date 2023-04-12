package Test;

public class _0121_BestTimeBuySellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++){
            int currentPrice = prices[i];
            int currentProfix = currentPrice - minPrice;

            if(currentPrice < minPrice){
                minPrice = currentPrice;
            }
            else if(currentProfix > maxProfit){
                maxProfit = currentProfix;
            }
        }

        return maxProfit;
	}
}
