package BitManipulation;

import java.util.Arrays;

class FindtheKorofanArray {
    public static void main(String[] args) {
        int[] nums = {7,12,9,8,9,15};
        int k = 4;
        int[] countBit = new int[31];
        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int x = 0;
            while(n>0){
                int bit = n&1;
                n = n >> 1;
                if(bit==1){
                    countBit[x] += 1; 
                }
                x++;
            }
        }
        int res = 0;
        for (int i = 0; i < 31; i++) {
            if (countBit[i] >= k) {
                res |= (1 << i);
            }
        }
        System.out.println(res);
        System.out.println(Arrays.stream(countBit).boxed().toList());
    }
}
