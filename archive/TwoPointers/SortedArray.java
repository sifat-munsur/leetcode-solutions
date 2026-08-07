

public class SortedArray {
    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int n = nums.length;
        int i=0, j=1;
        while(i<n && j<n){
            if(nums[i]%2 == 0){
                i += 2;
            }
            else if(nums[j]%2 == 1){
                j += 2;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        for(int k: nums){
            System.out.print(k+" ");
        }
        




        // for(int k: nums){
        //     System.out.print(i+ " ");
        // }
    }
    
}
