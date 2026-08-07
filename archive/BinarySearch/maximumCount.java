
public class maximumCount {
    public static void main(String[] args) {
        int[] nums = {0,0};
        int left = 0;
        int len = nums.length;
        int right = len - 1;
        int pos = len, neg = len;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                pos = mid;
                right = mid - 1;
            }
            else {           
                left = mid + 1;
            }
        }
        System.out.println(pos);

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= 0) {
                neg = mid;
                right = mid - 1;
            }
            else {           
                left = mid + 1;
            }
        }
        System.out.println(neg);
        System.out.println(Math.max(nums.length-pos, neg));

    

    }
}
