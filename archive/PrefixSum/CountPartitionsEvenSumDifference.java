package archive.PrefixSum;

public class CountPartitionsEvenSumDifference {
    public static void main(String[] args) {
        int[] nums = {10,10,3,7,6};
        int totalSum = 0;
        for(int i: nums){
            totalSum += i; 
        }
        System.out.println(totalSum%2==0 ? nums.length-1 : 0);
    }
}
