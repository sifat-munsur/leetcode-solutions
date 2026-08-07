package archive.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists {
    public static void main(String[] args) {
        // String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"}; 
        // String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0; i<list1.length; i++){
            map.put(list1[i],i);
        }
        List<String> ans = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i=0; i<list2.length; i++){
            int index = i + map.get(list2[i]);
            if(map.containsKey(list2[i])){
                if(index <= min){
                    ans.add(list2[i]);
                    min = index;
                }
                
            }
        }

        System.out.println(ans);

    }
}
