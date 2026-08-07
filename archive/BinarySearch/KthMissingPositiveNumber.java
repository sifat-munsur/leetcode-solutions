// package LeetCode.BinarySearch;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            int missing = arr[mid] - (mid+1);

            if (missing < k) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        System.out.println(left+k);
    }
}
