
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target =3;
        int left = 0;
        int right = nums.length-1;
        int res = 0;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] > target){
                res = mid;
                right = mid-1;
            }
            else if(nums[mid] < target){
                res = mid+1;
                left = mid + 1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
        System.out.println(res);
    }
}
