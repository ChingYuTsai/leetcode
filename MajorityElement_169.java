import java.util.Arrays;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length/2; i++){
            if(i == nums.length/2)
                return nums[i];
            if(nums[i] == nums[i + nums.length/2+1])
                return nums[i];
        }
        return -1;
    }
}
