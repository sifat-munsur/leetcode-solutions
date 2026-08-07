
import java.util.ArrayList;
import java.util.HashMap;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        int[] nums = {};
        HashMap<Integer, Integer> mapCount = new HashMap<>();
        for(int i: nums){
            mapCount.put(i, mapCount.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i: nums){
            arrayList.add(i);
        }
         int maxFreq = 0;
         int firstIndex = 0;
         int lastIndex =0;
         int res = Integer.MAX_VALUE;
        for(int key: mapCount.keySet()){
            if(mapCount.get(key) >= maxFreq){
                
                firstIndex = arrayList.indexOf(key);
                lastIndex = arrayList.lastIndexOf(key);
                if (mapCount.get(key) > maxFreq) {
                    res = Integer.MAX_VALUE;
                }
                maxFreq = mapCount.get(key);
                if((lastIndex - firstIndex) < res){
                    res = lastIndex - firstIndex;
                }
            }
        }
        if(nums.length>0){
            System.out.println(res+1);
        }
        else{
            System.out.println(0);
        }
       
       
        
        // int minIndex=nums.length-1;
        // int maxIndex=0;
        // for(int i=0; i<nums.length; i++){
        //     if(element == nums[i]){
        //         minIndex = Math.min(minIndex, i);
        //         maxIndex = Math.max(maxIndex, i);
                
        //     }
        // }
       // System.out.println(maxIndex-minIndex+1);
    }
}
