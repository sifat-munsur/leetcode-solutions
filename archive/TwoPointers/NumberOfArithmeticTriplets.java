
import java.util.HashSet;

public class NumberOfArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0,1,4,6,7,10};
        int diff = 3;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int count=0;
        for(int i: nums){
            if(set.contains(i+diff) && set.contains(i+2*diff)){
                count++;
            }
        }
        System.out.println(count);

    }
}
