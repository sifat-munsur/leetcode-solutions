
import java.util.HashSet;

public class MaximumUniqueSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,-10,6};
        // int sum = Arrays.stream(nums).filter(x -> x > 0).distinct().sum();
        // int max = Arrays.stream(nums).max().getAsInt();
        //System.out.println(sum > 0 ? sum : max);
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int maxElement = Integer.MIN_VALUE;
        for(int i: nums){
            maxElement = Math.max(maxElement,i);
            if(!set.contains(i) && i>0){
                set.add(i);
                sum += i;
            }
        }
        System.out.println(sum==0 ? maxElement : sum);
    }
}
