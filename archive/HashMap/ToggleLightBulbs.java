
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ToggleLightBulbs {
    public static void main(String[] args) {
        int[] nums = {100,100};
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)%2==1){
                list.add(key);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
