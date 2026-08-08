package BinarySearch;

import java.util.Arrays;

class Distance {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            int left = 0;
            int right = arr2.length-1;
            boolean flag = true;
            while(left <= right){
                int mid = left + (right-left)/2;
                if( Math.abs(arr1[i]-arr2[mid]) <= d){
                    flag = false;
                    break;
                }
                if (arr2[mid] < arr1[i]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if(flag){
                count++;
            }
        }


        return count;
    }    

    //1, 8, 9, 10

    public static void main(String[] args) {
        Distance sol = new Distance();
        int[] arr1 = {1,4,2,3};
        int[] arr2 = {-4,-3,6,10,20,30};
        int d = 3;
        System.out.println(sol.findTheDistanceValue(arr1, arr2, d));
    }
}




