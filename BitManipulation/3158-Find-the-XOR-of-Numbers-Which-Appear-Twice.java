package BitManipulation;

import java.util.HashSet;

class FindXORNumbersWhichAppearTwice {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2};
        int res = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                res ^= num;
            } else {
                set.add(num);
            }
        }
        System.out.println(res);

        // for(int i=0; i<nums.length; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if((nums[i]^nums[j]) == 0){
        //             res = res ^ nums[i];
        //         }
        //     }
        // }
        // System.out.println(res);
    }
}
