public class BestTimeToBuyAndSellStock_121 {

    public int maxProfit(int[] prices) {
        /* Kadane's algorithm */
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++){
            maxCur = Math.max(0, maxCur += prices[i]-prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }

    public int mySolution(int[] prices) {
        int max = 0;
        for(int i = 0; i< prices.length; i++){
            for(int j = i+1; j < prices.length; j++){
                if(prices[j] - prices[i] > max)
                    max = prices[j] - prices[i];
            }
        }
        return max;
    }
}
