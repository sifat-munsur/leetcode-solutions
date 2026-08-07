
import java.util.Arrays;

public class MinimumOperationsMake  {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int res = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] >= nums[i+1]){
                res += nums[i]-nums[i+1]+1;
                nums[i+1] = nums[i]+1;
            }
        }
        System.out.println(Arrays.stream(nums).boxed().toList());
        System.out.println(res);
    }
}
