package archive.Arrays;

import java.util.HashMap;

public class MostFrequentNumberKeyArray {
    public static void main(String[] args) {
        int[] nums = {1,100,200,1,100};
        HashMap<Integer,Integer> map = new HashMap<>();
        int key = 1;
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==key){
                map.put(nums[i+1], map.getOrDefault(nums[i+1], 0)+1);
            }
        }
        int result = -1;
        for(int k: map.keySet()){
            if(map.get(k) > count){
                count = map.get(k);
                result = k;
            }  
        }
        System.out.println(result);
    }
}
