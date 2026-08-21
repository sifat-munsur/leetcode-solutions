package BitManipulation;

import java.util.*;

class SortIntegersbyTheNumber{
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        Integer[] nums = new Integer[arr.length];
        for(int i=0; i<arr.length; i++){
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (a,b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            if(countA != countB){
                return countA-countB;
            }
            return a-b;
        });
        System.out.println(Arrays.toString(nums));
    }
}
