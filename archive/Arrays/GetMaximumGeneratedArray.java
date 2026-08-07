
import java.util.*;

public class GetMaximumGeneratedArray {
    public static void main(String[] args) {
        int n=4;
        int[] nums = new int[n+1];
        nums[0] = 0;
        if(n>0){
            nums[1] = 1;
        }
        int res = 0;
        for(int i=2; i<=n; i++){
            if(i%2==0){
                nums[i] = nums[i/2];
            }
            else{
                nums[i] = nums[i/2] + nums[i/2+1];
            }
            res = Math.max(res, nums[i]);

        }
        System.out.println(res);
        System.out.println(Arrays.stream(nums).boxed().toList());
    }
}
