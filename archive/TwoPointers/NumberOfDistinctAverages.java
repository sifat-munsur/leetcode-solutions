package archive.TwoPointers;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumberOfDistinctAverages {
    public static void main(String[] args) {
        int[] nums = {1,100};
        List<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        Collections.sort(list);
        System.out.println(list);
        Set<Float> average = new HashSet<>();        
        int j = list.size()-1;
        for(int i=0; i<(list.size()+1)/2; i++){
            float avg = (list.get(i)+list.get(j))/2.0f;
            average.add(avg);
            j--;
        }
        System.out.println(average.size());
    }
}
