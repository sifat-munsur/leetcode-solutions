package archive.TwoPointers;
import java.util.Arrays;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1,1,0};
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i+1] = 0;
            }
        }
        int left = 0;

        for(int right=0; right<nums.length; right++){
            if(nums[right] != 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        System.out.println(Arrays.stream(nums).boxed().toList());
    }
}
