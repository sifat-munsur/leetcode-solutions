package archive.PrefixSum;

import java.util.Arrays;

public class MaximumScore {
    public static void main(String[] args) {
        String s = "1111";
        char[] arr = s.toCharArray();
        int[] rightSum = new int[s.length()];
        rightSum[arr.length-1] = arr[arr.length-1]-'0';
        for(int i=arr.length-2; i>=0; i--){
            rightSum[i] =  rightSum[i+1]+arr[i]-'0';
        }
        System.out.println(Arrays.stream(rightSum).boxed().toList());
        int numberOfZero = 0;
        int res = -1;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]-'0' == 0){
                numberOfZero++;
            }
            int score = numberOfZero + rightSum[i + 1];
            res = Math.max(res, score);
        }
        System.out.println(res);
    }
}
