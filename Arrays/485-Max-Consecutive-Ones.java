package Arrays;

class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {0,1,1,0,1,1,0};
        int count = 0;
        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                res = Math.max(res, count);
            }
            else{
                count = 0;
            }
        }
        
        System.out.println(res);
    }
}
