
public class MinimumSwapsToMoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        int i=0;
        int j = nums.length-1;
        int res = 0;
        while(i<j){
            if(nums[i]==0 && nums[j]!=0){
                int swap = nums[i];
                nums[i] = nums[j];
                nums[j] = swap;
                i++;
                j--;
                res++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(res);
        for(int x=0; x<nums.length; x++){
            System.out.print(nums[x]+" ");
        }

    }
}
