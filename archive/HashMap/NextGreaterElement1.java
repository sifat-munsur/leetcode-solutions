
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};

        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        System.out.println(map);
        // Step 2: Remaining elements have no next greater
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }

        // Step 3: Build result for nums1
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
















        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0; i<nums2.length; i++){
        //     map.put(nums2[i], i);
        // }
        // int[] ans = new int[nums1.length];
        // for(int i=0; i<nums1.length; i++){
        //     int index = map.get(nums1[i]);
        //     int nextValue = -1;
        //      for(int j = index + 1; j < nums2.length; j++) {
        //         if(nums2[j] > nums1[i]) {
        //             nextValue = nums2[j];
        //             break;
        //         }
        //     }
        //     ans[i] = nextValue;
        // }
        // System.out.println(Arrays.stream(ans).boxed().toList());
        // System.out.println(map);
    }
}
