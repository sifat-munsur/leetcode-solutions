package BitManipulation;

import java.util.Arrays;

class CountingBits {
    public static int getBit(int n){
        int count = 0;
        while(n>0){
            int lastBit = n&1;
            if(lastBit==1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {

        int n = 5;
        int[] ans = new int[n+1];
        for(int i=1; i<=n; i++){
            ans[i] = ans[i & (i-1)] +1;
        }
        System.out.println(Arrays.stream(ans).boxed().toList());


        // int n = 5;
        // int[] ans = new int[n+1];
        // for(int i=0; i<=n; i++){
        //     ans[i] = getBit(i);
        // }
        // System.out.println(Arrays.stream(ans).boxed().toList());
    }
}
