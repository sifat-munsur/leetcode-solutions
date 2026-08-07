package archive.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MinimumIndexSumTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"happy","sad","good"};
        String[] list2 = {"sad","happy","good"};
        List<String> list = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<list1.length; i++){
            for(int j=0; j<list2.length; j++){
                if(list1[i].toString().equals(list2[j].toString())){
                    if((j+i) < diff){
                        list.clear();
                        list.add(list1[i].toString());
                        diff = j+i; 
                    }
                    else if(j+i == diff){
                        list.add(list1[i].toString());
                    }
                }
            }
        }
        System.out.println(list);
    }
}
