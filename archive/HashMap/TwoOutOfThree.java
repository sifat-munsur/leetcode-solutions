
import java.util.HashSet;

public class TwoOutOfThree {
    public static void main(String[] args) {
        int[] nums1 = {3,1,4};
        int[] nums2 = {2,3};
        int[] nums3 = {2,1};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }
        for(int i: nums3){
            set3.add(i);
        }

        HashSet<Integer> resSet = new HashSet<>();

        for(int i: set1){
            if(set2.contains(i)){
                resSet.add(i);
            }
        }
        for(int i: set1){
            if(set3.contains(i)){
                resSet.add(i);
            }
        }
        for(int i: set3){
            if(set2.contains(i)){
                resSet.add(i);
            }
        }

        int[] arr = new int[resSet.size()];
        int index=0;
        for(int i: resSet){
            arr[index++] = i;
        }
        for(int i: arr){
            System.out.println(i);
        }


        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        System.out.println(resSet);

    }
}
