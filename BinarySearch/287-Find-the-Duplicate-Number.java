package BinarySearch;

class Duplicate {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int count = 0;
            int mid = left + (right-left)/2;
            for(int num: nums){
                if(num <= mid){
                    count++;
                }
            }
            if(count > mid){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        
        System.out.println("hello");
        System.out.println(left);

    }
}
