
import java.util.*;

public class FindMissingElements {
    public static void main(String[] args) {
        int[] nums = {1,4,2,5};

        List<Integer> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        Collections.sort(list);
        int minValue = Collections.min(list);
        int maxValue = Collections.max(list);
        int len = maxValue-minValue;

        for(int i=0; i<= len; i++){
            result.add(minValue);
            minValue++;
        }
        for(int i: list){
            result.remove(Integer.valueOf(i));
        }
        System.out.println(result);

    }
}
