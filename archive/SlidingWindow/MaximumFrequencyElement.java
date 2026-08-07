package archive.SlidingWindow;

import java.util.Arrays;

public class MaximumFrequencyElement {
    public static void main(String[] args) {
        int[] nums = {2,70,73};
        int k = 39;
        int numOperations = 2;
        Arrays.sort(nums);
        int left = 0;
        int maxFreq = 1;
        for (int right = 0; right < nums.length; right++) {
            while (nums[right] - nums[left] > k) {
                left++;
            }
            int windowSize = right - left + 1;
            maxFreq = Math.max(maxFreq, Math.min(windowSize, numOperations + 1));
        }

        // return maxFreq;
        System.out.println(maxFreq);
    }
}
