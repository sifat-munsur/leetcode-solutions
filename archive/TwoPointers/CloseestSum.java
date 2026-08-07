package archive.TwoPointers;

import java.util.*;

public class CloseestSum {
    public static void main(String[] args) {
     
        int[] nums = {10,20,30,40,50,60,70,80,90};
        int target = 1;

        Arrays.sort(nums);

        int closestSum = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(target - closestSum);

        for(int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                int diff = Math.abs(target - sum);
                if(diff < minDiff) {
                    minDiff = diff;
                    closestSum = sum;
                }

                if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        System.out.println(closestSum);
    }
}

  