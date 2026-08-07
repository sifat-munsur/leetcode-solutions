
import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        // int[] nums = {1};
        // int k=1;
        int maxValue = nums[0];
        for(int i=1; i<k; i++){
            maxValue = Math.max(maxValue, nums[i]);
        }
        List<Integer> list = new ArrayList<>();
        list.add(maxValue);
        for(int i=k; i<nums.length; i++){
            maxValue = Math.max(maxValue, nums[i]);
            list.add(maxValue);
        }
        System.out.println(list);
    }
}
