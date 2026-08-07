package archive.Sorting;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {-2,45,0,11,-9};
        
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-i-1; j++){
                if(nums[j]>nums[j+1]){
                    int swap = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = swap;
                }
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(Arrays.toString(nums));
    }
}
