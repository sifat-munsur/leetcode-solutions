package LeetCode.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int k = 4, x = -1;
        int left = 0;
        int right = arr.length-1;
        while(right>left){
            if(right-left+1 == k){
                break;
            }
            if(Math.abs(arr[right]-x) >= Math.abs(arr[left]-x)){
                right--;
            }
            else{
                left++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
