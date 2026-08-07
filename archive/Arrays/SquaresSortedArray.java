
import java.util.Arrays;

public class SquaresSortedArray {
    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while(left <= right){
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];
            if(leftSq > rightSq){
                result[index] = leftSq;
                left++;
            } else {
                result[index] = rightSq;
                right--;
            }
            index--;
        }
        System.out.println(Arrays.stream(result).boxed().toList());

    }
}
