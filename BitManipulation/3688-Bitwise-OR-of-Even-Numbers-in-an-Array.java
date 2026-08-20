package BitManipulation;

class BitwiseEvenNumbersArray {
    public static void main(String[] args) {
        int[] nums = {1,8,16};
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                ans = ans | nums[i];
            }
        }
        System.out.println(ans);
    }
}
