
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumAverage {
    public static void main(String[] args) {
        int[] nums = {7,8,3,4,15,13,4,1};
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        Collections.sort(list);
        System.out.println(list);
        List<Float> average = new ArrayList<>();        
        int j = list.size()-1;
        for(int i=0; i<(list.size()+1)/2; i++){
            float avg = (list.get(i)+list.get(j))/2.0f;
            average.add(avg);
            j--;
        }
        System.out.println(Collections.min(average));
        
    }
}
