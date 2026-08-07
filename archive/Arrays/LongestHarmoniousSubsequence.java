
import java.util.*;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,2,3};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num,  freq.getOrDefault(num, 0) + 1);
        }
        int res =0;
        for(int key: freq.keySet()){
            if(freq.containsKey(key+1)){
                res = Math.max(res, freq.get(key)+freq.get(key+1));
            }
        }
        System.out.println(res);
    }
}
