package LeetCode.PrefixSum;

import java.util.Arrays;

public class EqualScoreSubstrings {
    public static void main(String[] args) {
        String s = "bace";
        char[] arr = s.toCharArray();
        int totalSum = 0;
        boolean exist = false;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i]-'a'+1;
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<arr.length; i++){
            int value = arr[i]-'a'+1;
            leftSum += value;
            rightSum = totalSum - leftSum;
            if(leftSum == rightSum){
                exist = true;
                break;
            }
        }
        System.out.println(exist);
    }
}
