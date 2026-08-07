package archive.Arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,0,1};
        int res = Integer.MAX_VALUE;
        int firstIndex = 0;
        int value = 0;
        for(int i=0; i<nums.length; i++){
            if(value+nums[i] == 3){
                res = Math.min(res, i-firstIndex);
                value = 0;
                firstIndex = 0;
            }
            if(nums[i] != 0){
                firstIndex = i;
                value = nums[i];
            }
        }
        System.out.println((res==Integer.MAX_VALUE) ? -1 : res);
        System.out.println(res);
    }
}
