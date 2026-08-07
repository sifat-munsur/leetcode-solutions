
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] nums = {10,15,20};
        int preValue1 = nums[0];
        int preValue2 = nums[1];
        for(int i=2; i<nums.length; i++){
            int current = Math.min(preValue1, preValue2) + nums[i];
            preValue1 = preValue2;
            preValue2 = current;
        }
        System.out.println(Math.min(preValue1, preValue2));
    }
}
