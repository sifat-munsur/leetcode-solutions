
import java.util.Arrays;

public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            if(nums[left]%2==0){
                left++;
            }
            else if(nums[right]%2==1){
                right--;
            }
            else{
                int swap = nums[left];
                nums[left] = nums[right];
                nums[right] = swap;
            }
        }
        System.out.println(Arrays.stream(nums).boxed().toList());
    }
}
