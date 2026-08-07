package archive.TwoPointers;
import java.util.HashSet;

public class LargestPositivegative {
    public static void main(String[] args) {
        int[] nums = {-1,10,6,7,-7,1};
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }
        int res = -1;
        for(int i: nums){
            if(i<0 && set.contains(-i)){
                if(Math.abs(i) > res){
                    res = Math.abs(i);
                }
                System.out.println(res);
            }
        }
    }
}
