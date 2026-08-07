package archive.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {1};
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<stones.length; i++){
            res.add(stones[i]); 
        }
        
        while (res.size() > 1){     
            int maxValue = Collections.max(res);
            int maxIndex = res.indexOf(maxValue);
            res.remove(maxIndex);       
            int secondMaxValue = Collections.max(res);
            int secondMaxIndex = res.indexOf(secondMaxValue);
            res.remove(secondMaxIndex);
            if(secondMaxValue<maxValue){
                res.add(maxValue-secondMaxValue);
            }
        }
        if(res.size()==1){
            System.out.println(res.get(0));
        }
        else{
            System.out.println(0);
        }

    }
}
