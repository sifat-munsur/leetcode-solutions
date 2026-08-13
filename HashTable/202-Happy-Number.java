package HashTable;

import java.util.HashSet;
import java.util.Set;

class HappyNumber {
    public static boolean getSquareSum(int n, Set<Integer> seen){
        if(n==1){
            return true;
        }
        int sum = 0;
        if(seen.contains(n)){
            return false;
        }
        seen.add(n);
        while(n>0){
            int digit = n%10;
            n = n/10;
            sum += Math.pow(digit, 2);
        }
        return getSquareSum(sum, seen);
    }
    public static void main(String[] args) {
        
        int n = 2;
        System.out.println(getSquareSum(n, new HashSet<>()));
    }
}
