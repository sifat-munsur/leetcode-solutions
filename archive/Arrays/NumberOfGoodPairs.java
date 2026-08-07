package archive.Arrays;

import java.util.*;
public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        System.out.println(map);
        int res = 0;
        for(int key: map.keySet()){
            int x = map.get(key);
            if(x >= 2){
                res += ((x-1) * x ) / 2;
            }
        }
        System.out.println(res);


    }
}
