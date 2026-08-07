
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {

        int[] nums = {4,1,2,1,2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
        for(int key: map.keySet()){
            if(map.get(key)==1){
                System.out.println(key);
            }
        }

        // Arrays.sort(nums);
        // for(int i: nums){
        //     System.out.println(i);
        // }
        // //1,1,2,2,4
        // for(int i=0; i<=(nums.length-2); i=i+2){
        //     if(nums[i] != nums[i+1]){
        //         System.out.println(nums[i+1]);
        //     }
        // }
    }
}
