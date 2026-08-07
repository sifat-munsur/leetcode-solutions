
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Set<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        if(set.size() >=3){
            System.out.println(list.get(list.size()-3));
        }
        else{
            System.out.println(list.get(list.size()-1));
        }

        System.out.println(set);

        // int firstMax = Collections.max(list);
        // list.remove(Integer.valueOf(firstMax));
        // int secondMax = Collections.max(list);
        // list.remove(Integer.valueOf(secondMax));
        // int thirdMax = Collections.max(list);
        // list.remove(Integer.valueOf(thirdMax));
            

    }
}
