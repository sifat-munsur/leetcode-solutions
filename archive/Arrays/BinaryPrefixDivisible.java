package archive.Arrays;
// package LeetCode.Array;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisible {
    public static void main(String[] args) {
        int[] nums = {1,0,1};
        List<Boolean> res = new ArrayList<>();
        int rem = 0;
        for(int i=0; i<nums.length; i++){
            rem = (rem * 2 + nums[i]) % 5;
            res.add(rem == 0);
        }
        System.err.println(res);
    }
}
