import java.util.Arrays;

public class MoveZeroes_283 {
    public static void moveZeroes(int[] nums) {
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0) nums[index++]=nums[i];
        }
        while(index<nums.length){
            nums[index++]=0;
        }
    }

    public static void main(String[] args){
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
