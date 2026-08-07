package archive.SlidingWindow;
 
public class SubarrayProductLessThanK {
    public static void main(String[] args) {
        int[] nums = {2};
        int k = 1;
        int left = 0;
        int count = 0;
        int product = 1;
        if (k <= 1) {
            System.out.println(0);
            return ;
        }
        for(int right=0; right<nums.length; right++){
            product *= nums[right];
            while (product >= k) {
                product /= nums[left++];
            }
            count += right-left+1;
        }
        System.out.println(count);
    }
}
