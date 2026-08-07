package archive.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumDistanceBetween {
    public static void main(String[] args) {
        int[] nums = {1,2,1,1,3};
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        System.out.println(map);
        int ans = Integer.MAX_VALUE;
        for(List<Integer> list: map.values()){
           if(list.size() < 3){
                continue;
           }
           for(int i=0; i<=list.size()-3; i++){
                int distance = list.get(i+2) - list.get(i);
                ans = Math.min(2*distance, ans);
           }
        }
        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }
}
