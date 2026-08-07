package archive.PrefixSum;

public class SumOfAllOddLengthSubarrays {
    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        int n = arr.length;
        int result = 0;
        for(int i=0; i<arr.length; i++){
            int total = (i + 1) * (n - i);
            int odd = (total+1)/2;
            result += arr[i]*odd;
        }
        System.out.println(result);
    }
}
