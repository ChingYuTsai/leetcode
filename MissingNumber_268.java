import java.util.Arrays;

public class MissingNumber_268 {
    public int missingNumber(int[] nums) {
        /*
            a ^ b ^ b = a
            Time complexity : O(n)
            Space complexity : O(1)
         */
        int xor = 0;
        for(int i = 0; i < nums.length; i++)
            xor ^= i ^ nums[i];
        return xor ^ nums.length;
    }

    public int mySolution(int[] nums) {
        /*
            Time complexity : O(nlgn)
            Space complexity : O(1) or O(n)
         */
        if(nums.length == 0) return -1;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i != nums[i] && nums[i] == i+1)
                return nums[i]-1;
        }
        return nums.length;
    }
}
