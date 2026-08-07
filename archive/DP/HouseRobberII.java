package archive.DP;

public class HouseRobberII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        // int[] nums = {2,3,2}; 
        if(nums.length == 1){
            System.out.println(nums[0]);
        }
        if(nums.length==2){
            System.out.println(Math.max(nums[0], nums[1]));
        }
        int preValue1 = nums[0];
        int preValue2 = Math.max(nums[0],nums[1]);
        for(int i=2; i<nums.length; i++){
            if(i==nums.length-1){
                System.out.println(Math.max(nums[i], preValue2));
            }
            int current = Math.max(preValue1+nums[i], preValue2);
            preValue1 = preValue2;
            preValue2 = current;
        }
        System.out.println(Math.max(preValue1, preValue2));
    }
}
