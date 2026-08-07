package archive.Arrays;

public class SmallestStableIndex {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int k = 1;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            int maxLeft = nums[0];
            for(int j=0; j<=i; j++){
                maxLeft = Math.max(maxLeft, nums[j]);
            }

            int minRight = nums[i];
            for(int j=i; j<nums.length; j++){
                minRight = Math.min(minRight, nums[j]);
            }
            if((maxLeft-minRight) <= k){
                ans = Math.min(ans, i);
            }
        }
        System.out.println(ans==Integer.MAX_VALUE ? -1 : ans);
    }
}
