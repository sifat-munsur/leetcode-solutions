
public class MinimumDistanceTargetElement {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int target = 1;
        int start = 0;
        int res = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                int a = Math.abs(i-start);
                res = Math.min(res, a);
            }
        }
        System.out.println(res);
    }
}
