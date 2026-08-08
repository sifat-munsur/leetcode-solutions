package BinarySearch;

import java.util.Arrays;

class PositionSortedArray{

    public static int firstIndex(int[] arr, int target){
        int ans = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                ans = mid;
                right = mid-1;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }

    public static int secondIndex(int[] arr, int target){
        int ans = -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] == target){
                ans = mid;
                left = mid+1;
            }
            else if(arr[mid] > target){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        int[] res = {-1, -1};
        res[0] = firstIndex(nums, target);
        res[1] = secondIndex(nums, target);
        System.out.println(Arrays.toString(res));
    }
    
}
