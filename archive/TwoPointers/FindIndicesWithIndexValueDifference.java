

public class FindIndicesWithIndexValueDifference {    public static void main(String[] args) {
        int[] nums = {2,29,0};
        int indexDifference = 0;
        int valueDifference =12;
        int[] arr = {-1, -1};
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(Math.abs(i-j)>=indexDifference && Math.abs(nums[i]-nums[j]) >= valueDifference){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        for(int x: arr){
            System.out.println(x);
        }
       
    }
}
