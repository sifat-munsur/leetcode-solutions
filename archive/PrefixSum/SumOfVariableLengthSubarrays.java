package archive.PrefixSum;

import java.util.Arrays;

public class SumOfVariableLengthSubarrays {
    public static void main(String[] args) {
        int[] nums = {3,1,1,2};
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        int total = 0;
        for(int i=1; i<nums.length; i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int start = Math.max(0, i-nums[i]);
            int value;
            if(start == 0){
                value = prefixSum[i];
            } else {
                value = prefixSum[i] - prefixSum[start - 1];
            }
            total += value;
        }
        System.out.println(Arrays.stream(prefixSum).boxed().toList());
        System.out.println(total);
    }
}
