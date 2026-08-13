package Arrays;

import java.util.HashSet;
import java.util.Set;

class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for(int i: nums){
            if(set.contains(i)){
                res[0] = i;
            }
            set.add(i);
        }
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                res[1] = i;
            }
        }
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
