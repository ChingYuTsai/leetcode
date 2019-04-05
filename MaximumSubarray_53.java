public class MaximumSubarray_53 {
    public int maxSubArray1(int[] nums) {
        int maxHere = nums[0];
        int maxSoFar = nums[0];
        for(int i = 1; i< nums.length; i++){
            maxHere = Math.max(maxHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxHere, maxSoFar);
        }
        return maxSoFar;
    }

    public int maxSubArray2(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int maxVal = nums[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = nums[i] + (dp[i-1] > 0 ? dp[i-1] : 0);
            maxVal = Math.max(maxVal, dp[i]);
        }
        return maxVal;
    }

    public int mySolution(int[] nums) {
        int minVal = Integer.MIN_VALUE;
        int curVal = 0;
        int maxVal = 0;
        for(int i = 0; i< nums.length; i++){
            minVal = Math.max(minVal, nums[i]);
            curVal = Math.max(0, curVal + nums[i]);
            maxVal = Math.max(curVal, maxVal);
        }
        if(minVal < 0 ) return minVal;
        return maxVal;
    }
}
