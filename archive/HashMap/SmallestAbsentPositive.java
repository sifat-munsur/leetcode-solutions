package archive.HashMap;

import java.util.HashSet;

public class SmallestAbsentPositive {
    public static void main(String[] args) {
        int[] nums = {1,-39,9};
        int total =0;
        HashSet<Integer> set = new HashSet<>();
        for(int i: nums){
            total += i;
            set.add(i);
        }
        double avg = (double) total/nums.length;
        int missing = (int) Math.floor(avg+1);
        missing = missing <= 0 ? 1 : missing;
        while (set.contains(missing)) {
            missing++;
        }
        System.out.println(missing);
    }
}
