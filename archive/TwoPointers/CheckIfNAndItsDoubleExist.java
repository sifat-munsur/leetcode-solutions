package archive.TwoPointers;
import java.util.HashSet;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
        int[] arr = {7,1,14,11};
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            set.add(i);
        }
        boolean exist = false;
        for(int i: arr){
            if(exist){
                break;
            }
            exist = set.contains(2*i);
        }
        System.out.println(exist);
    }
}
