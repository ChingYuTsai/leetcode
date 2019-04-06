import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        /* O(n) Solution */
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }

    public int[] mySolution(int[] nums, int target) {
        /* O(n2) Solution */
        for(int i = 0; i < nums.length; i++){
            int remain = target - nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(remain == nums[j])
                    return new int[]{i, j};
            }
        }
        return null;
    }
}
