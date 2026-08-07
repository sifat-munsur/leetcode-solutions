package archive.DP;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        int n=25;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }
        int[] nums = new int[n+1];
        nums[0] = 0;        
        nums[1] = 1;
        nums[2] = 1;
        int ans = 0;
        for(int i=3; i<=n; i++){
            ans = nums[i-3]+nums[i-1]+nums[i-2];
            nums[i] = ans;
        }
        System.out.println(ans);
    }
}
