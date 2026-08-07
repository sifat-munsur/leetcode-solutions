
import java.util.Set;
import java.util.TreeSet;

public class SmallestissingMultipleOfK {
    public static void main(String[] args) {
        int[] nums = {8,3,4};
        int k=2;
        int res = k;
        Set<Integer> set = new TreeSet<>();
        for(int i: nums){
            if(i%k==0){
                set.add(i);
            }
        }
        for(int i: set){
            if(i != res){
                System.out.println(k);
                break;
            }
            res +=k;
        }
        System.out.println(res);
        System.out.println(set);
    }
}
