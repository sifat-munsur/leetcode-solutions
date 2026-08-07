
import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        int k = 2;
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for(int i=0; i <= (nums.length-k); i++){
             int min = nums[i];
             int max = nums[i+k-1];             
             if(max-min < diff){
                diff = max-min;
             }
        }
        System.out.println(diff);            
    }
}
