package BitManipulation;

class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,3,2};
        int val = 0;
        for(int i=0; i<nums.length-1; i++){
            val = nums[i+1] | nums[i];
        }
        System.out.println(val);
    }
}
