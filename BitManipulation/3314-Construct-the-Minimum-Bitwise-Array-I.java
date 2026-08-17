package BitManipulation;

import java.util.Arrays;

class MinimumBitwiseArray{
    public static void main(String[] args) {
        int[] nums = {2,3,5,7};
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if ((nums[i] & 1) == 0) {
                ans[i] = -1;
                continue;
            }
            int pos = 0;
            while((nums[i] & (1 << pos)) !=0){
                pos++;
            }
            ans[i] = (nums[i] - (1 << pos-1));
        }
        System.out.println(Arrays.stream(ans).boxed().toList());
    }
}
