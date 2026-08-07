
import java.util.Arrays;
import java.util.HashMap;

public class SortArraybyIncreasingFrequency {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, (a,b) -> {
            int freq_a = map.get(a);
            int freq_b = map.get(b);
            if(freq_a==freq_b){
                return b-a;
            }
            return freq_a-freq_b;
        });
        int[] result = Arrays.stream(arr).mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(result));
    }
}
