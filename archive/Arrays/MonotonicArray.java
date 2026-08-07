
public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        boolean valid = false;
        int i = 0;
        while(i < nums.length-1 && nums[i] <= nums[i+1]){
            i++;
            valid = true;
        }
        System.out.println(i==nums.length-1 && valid);
        i=0;
        while(i < nums.length-1 && nums[i] >= nums[i+1]){
            i++;
            valid = true;
        }

        System.out.println(i==nums.length-1 && valid);
    }
}
