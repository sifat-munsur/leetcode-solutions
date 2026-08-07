
public class MinimumOperationsEqualizeArray {
    public static void main(String[] args) {
        int[] nums = {5,5,5};
        int count = 0;
        int fristValue = nums[0];
        boolean allEqual = true;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[0]) {
                allEqual = false;
                break;
            }
        }
        if (allEqual){
            System.out.println(0);
        };
        for(int i=1; i<nums.length; i++){
            fristValue &= nums[i];
        }
        if(fristValue != 0) {
            System.out.println(1);
        };
        int currentAnd = ~0;
        for(int i: nums){
            currentAnd &= i;
            if(currentAnd == 0){
                count++;
                currentAnd = ~0;
            }
        }
        System.out.println(count);
    }
}
