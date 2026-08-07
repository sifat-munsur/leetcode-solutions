package archive.Math;

import java.util.Arrays;


public class largestPerimeter {
    public static void main(String[] args) {
        int[] nums = {1,10,1,2};
        Arrays.sort(nums);
        int perimenter = 0;
        for(int i=nums.length-1; i>=2; i--){
            if(nums[i-1] + nums[i-2] > nums[i]){
                perimenter = nums[i] + nums[i-1] + nums[i-2];
            }            
        }

        System.out.println(perimenter);

    }    
}
