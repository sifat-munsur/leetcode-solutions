
import java.util.HashMap;

public class LuckyInteger {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        HashMap<Integer,Integer> mapCount = new HashMap<>();
        for(int i: arr){
            mapCount.put(i, mapCount.getOrDefault(i, 0)+1);
        }
        int largestLucky = 0;
        for(int key: mapCount.keySet()){
            if(key == mapCount.get(key) && key>largestLucky){
                largestLucky = key;
            }
        }
        if(largestLucky > 0){
            System.out.println(largestLucky);
        }
        else{
            System.out.println(-1);
        }
    }
}
