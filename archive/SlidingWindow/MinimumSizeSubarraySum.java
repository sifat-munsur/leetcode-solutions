package archive.SlidingWindow;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int target = 11;
        int[] nums = {1,1,1,1,1,1,1,1};
        int left = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;;
        for(int right=0; right<nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                len = Math.min(right-left+1, len);
                sum -= nums[left];
                left++;
            }
        }
        System.out.println(len==Integer.MAX_VALUE ? 0 : len);
    }    
}
