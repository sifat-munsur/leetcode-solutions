
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        Set<Integer> set = new HashSet<>();
        boolean exist = false;
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                exist = true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        System.out.println(exist);
    }
}
