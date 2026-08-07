
import java.util.Arrays;

public class TransformArrayParity {
    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4};
        int[] result = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int num: nums){
            if(num%2==0){
                result[left] = 0;
                left++; 
            }
            else{
                result[right] = 1;
                right--;
            }
        }
        System.out.println(Arrays.stream(result).boxed().toList());
    }
}
