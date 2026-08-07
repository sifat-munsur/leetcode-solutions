package LeetCode.PrefixSum;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinimumValueGetPositive {
    public static void main(String[] args) {
        int[] nums = {-3,2,-3,4,2};
        int[] prefixSum = new int[nums.length];
        int startValue = 0;
        prefixSum[0] = nums[0];
        for(int i=1; i<nums.length; i++){            
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        int min = Arrays.stream(prefixSum).min().getAsInt();
        startValue = min >= 0 ? 1 : 1-min;
        System.out.println(min);
        System.out.println(startValue);

    }
}
