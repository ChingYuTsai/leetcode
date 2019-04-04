import java.util.Arrays;

public class CoinChange_322 {
    public static int coinChange(int[] coins, int amount) {
        /* top bottom */
        if(amount < 1) return 0;
        return helper(coins, amount, new int[amount]);
    }

    private static int helper(int[] coins, int remain, int[] count){
        if(remain < 0 ) return -1;
        if(remain == 0) return 0;
        if(count[remain-1] != 0) return count[remain-1];
        int min = Integer.MAX_VALUE;
        for(int coin : coins){
            int res = helper(coins, remain-coin, count);
            if(res >= 0 && res < min)
                min = 1 + res;
        }
        count[remain - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[remain - 1];
    }

    public static int coinChange1(int[] coins, int amount) {
        /* bottom up */
        if(coins == null || coins.length == 0 || amount <= 0) return 0;
        int[] minTimes = new int[amount + 1];
        for(int i = 1; i <= amount; i++){
            minTimes[i] = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++){
                if(coins[j] <= i && minTimes[i - coins[j]] != Integer.MAX_VALUE)
                    minTimes[i] = Math.min(1 + minTimes[i - coins[j]], minTimes[i]);
            }
        }
        return minTimes[amount] == Integer.MAX_VALUE ? -1 : minTimes[amount];
    }

    public static void main(String[] args){
        int[] coins = new int[]{186,83,419,408};
        System.out.println(coinChange(coins, 6249));
    }
}
