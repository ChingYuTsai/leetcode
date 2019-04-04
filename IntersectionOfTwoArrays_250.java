import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoArrays_250 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int pont1 = 0;
        int pont2 = 0;

        while(pont1 < nums1.length && pont2 < nums2.length){
            if(nums1[pont1] < nums2[pont2]){
                pont1++;
            }else if(nums1[pont1] > nums2[pont2]){
                pont2++;
            }else{
                list.add(nums1[pont1]);
                pont1++;
                pont2++;
            }
        }

        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++)
            result[i] = (Integer)list.get(i);

        return result;
    }

    public int[] mySolution(int[] nums1, int[] nums2) {
        Integer[] nums1a = Arrays.stream( nums1 ).boxed().toArray( Integer[]::new );
        Integer[] nums2a = Arrays.stream( nums2 ).boxed().toArray( Integer[]::new );
        List list1 = nums1.length >= nums2.length ? new LinkedList<Integer>(Arrays.asList(nums1a)) : new LinkedList<Integer>(Arrays.asList(nums2a));
        List list2 = nums1.length >= nums2.length ? new LinkedList<Integer>(Arrays.asList(nums2a)) : new LinkedList<Integer>(Arrays.asList(nums1a));

        for(int i = 0; i < list2.size(); i++){
            if(list1.contains(list2.get(i))) {
                for (int j = 0; j < list1.size(); j++) {
                    if (list2.get(i).equals(list1.get(j))) {
                        list1.remove(j);
                        break;
                    }
                }
            }else {
                list2.set(i, null);
            }
        }

        while(list2.remove(null)){}

        int[] result = new int[list2.size()];
        for(int i = 0; i < result.length; i++)
            result[i] = (Integer)list2.get(i);

        return result;
    }
}
