package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Equalindromic {

    public static long createPalindrome(long prefix, boolean isOdd){
        String left = String.valueOf(prefix);
        String right = new StringBuilder(left).reverse().toString();
        if(isOdd){
            right = right.substring(1);
        }
        return Long.parseLong(left+right);
    }
    public static List<Long> getPalindromes(Long n){
        List<Long> list = new ArrayList<>();
        String s = String.valueOf(n);
        int len = s.length();
        long prefix = Long.parseLong(s.substring(0, (len+1)/2));
        list.add(createPalindrome(prefix, len%2==1));
        list.add(createPalindrome(prefix+1, len%2==1));
        list.add(createPalindrome(prefix-1, len%2==1));
        list.add((long) Math.pow(10, len-1) -1);
        list.add((long) Math.pow(10, len) +1);        
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {22,33,22,33,22};
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        List<Long> candidates = getPalindromes((long)mid);
        long minCost = Long.MAX_VALUE;
        for(long val: candidates){
            long sum=0;
            for(int num: nums){
                sum += Math.abs(num-val);
            }
            minCost = Math.min(minCost, sum);
        }
        System.out.println(minCost);
    }
}


