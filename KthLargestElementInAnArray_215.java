import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {
    public int findKthLargest(int[] nums, int k) {
        /* time: O(NlogK)  space: O(K) */
        PriorityQueue<Integer> p = new PriorityQueue<Integer>();
        for(int i = 0; i < nums.length; i++){
            p.add(nums[i]);
            if(p.size() > k) p.poll();
        }
        return p.poll();
    }

    public int findKthLargest1(int[] nums, int k) {
        /* time: O(NlogN)  space: O(1) */
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
