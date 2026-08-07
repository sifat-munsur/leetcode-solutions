
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortEvenOddIndicesIndependently {
    public static void main(String[] args) {
        int[] nums = {4,1,2,3};

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int eIndex = 0;
        int oIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = even.get(eIndex++);
            }
            else{
                nums[i] = odd.get(oIndex++);
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
