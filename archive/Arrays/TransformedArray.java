
package archive.Arrays;

import java.util.Arrays;

public class TransformedArray {
    public static void main(String[] args) {
        int[] nums = {-1,4,-1};
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0; i<nums.length; i++){
            int pos = (i+nums[i])%n;
            if(pos<0){
                pos = pos+n;
            }
            result[i] = nums[pos];
        }
        System.out.println(Arrays.stream(result).boxed().toList());
    }
}
