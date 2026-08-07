package archive.TwoPointers;
import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndicesInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,4,9,1,3,9,5};
        int  key = 9;
        int k = 1;
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(key==nums[i]){
                list.add(i);
            }
        }
        for(int i=0; i<nums.length; i++){
            for (int j = 0; j < list.size(); j++) {
                if (Math.abs(i - list.get(j)) <= k) {
                    resultList.add(i);
                    break;
                }
            }
        }
        System.out.println(resultList);
        System.out.println(list);
    }
}
