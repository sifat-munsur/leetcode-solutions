package archive.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,151,19};
        int[] arr2 = {2,1,4,3,9,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> newArray = new ArrayList<>();
        ArrayList<Integer> copyArr1 = new ArrayList<>();
        for(int i: arr1){
            copyArr1.add(i);
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i: arr2){
            newArray.addAll(Collections.nCopies(map.get(i), i));
            copyArr1.removeIf(n -> n == i);
        }
        Collections.sort(copyArr1);
        newArray.addAll(copyArr1);

        System.out.println(map);
        System.out.println(copyArr1);
        System.out.println(newArray);



    }
}
