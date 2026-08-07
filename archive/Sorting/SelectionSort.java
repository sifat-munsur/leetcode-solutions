
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {20, 12, 10, 15, 2 };
        for(int i=0; i<nums.length-1; i++){
            int index = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]<nums[index]){
                    index = j;
                }
            }
            int swap = nums[index];
            nums[index] = nums[i];
            nums[i] = swap;
        System.out.println(Arrays.toString(nums));        
        }
        System.out.println(Arrays.toString(nums));   
    }
}
