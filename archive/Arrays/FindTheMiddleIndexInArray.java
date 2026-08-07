package archive.Arrays;

public class FindTheMiddleIndexInArray {
    public static void main(String[] args) {
        int[] nums = {2,5};
        int left = 0, right = 0;
        int total = 0;
        for(int i: nums){
            total += i;
        }
        for(int i=0; i<nums.length; i++){
            right = total - left - nums[i];
            if(right==left){
                System.out.println(i);
            }
            left += nums[i];
        }
    }
}
