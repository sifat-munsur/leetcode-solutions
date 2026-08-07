

package archive.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ConcatenateArrayWithReverse {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        for(int i=nums.length-1; i>=0; i--){
            list.add(nums[i]);
        }
        int[] arr = list.stream().mapToInt(Integer::intValue).toArray();
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println(list);
    }
    
}