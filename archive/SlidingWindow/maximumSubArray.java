package archive.SlidingWindow;

public class maximumSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        int sum=0;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        int maxSum=sum;
        for(int i=k; i<nums.length; i++){
            sum += nums[i];
            sum -= nums[i-k];
            maxSum = Math.max(maxSum, sum);
            System.out.println(sum);
        }
        System.out.println((double) maxSum/k);


    }    
}
