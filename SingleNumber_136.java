import java.util.Arrays;

public class SingleNumber_136 {
    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i=i+2){
            if(i == nums.length-1)
                return nums[i];
            else
                if(nums[i] != nums[i+1])
                    return nums[i];
        }
        return 0;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2,2,1};
        System.out.println(singleNumber(nums));
    }
}
