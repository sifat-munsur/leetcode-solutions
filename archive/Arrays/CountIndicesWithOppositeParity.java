package archive.Arrays;

import java.util.Arrays;

public class CountIndicesWithOppositeParity {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = new int[nums.length];
        int even = 0;
        int odd = 0;
        for(int i: nums){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                result[i] = odd;
                even--;
            }
            else{
                result[i] = even;
                odd--;
            }
        }
        System.out.println(Arrays.stream(result).boxed().toList());
    }
}
