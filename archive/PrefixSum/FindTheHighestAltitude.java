package archive.PrefixSum;

import java.util.Arrays;

public class FindTheHighestAltitude {
    public static void main(String[] args) {
        int[] nums = {-4,-3,-2,-1,4,3,2};
        int[] prefixSum = new int[nums.length+1];
        prefixSum[0] = 0;
        int res = prefixSum[0];
        for(int i=0; i<nums.length; i++){
            prefixSum[i+1] = prefixSum[i]+nums[i];
            res = Math.max(res, prefixSum[i+1]);
        }
        System.out.println(Arrays.stream(prefixSum).boxed().toList());
        System.out.println(res);
    }
}
