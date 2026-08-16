package BitManipulation;

import java.util.Arrays;

class NumberEvenOddBits {
    public static void main(String[] args) {
        int n = 2;
        int i = -1;
        int even = 0;
        int odd = 0;
        while(n>0){
            i++;
            int bit = n & 1;
            n = n >> 1;
            if(bit == 1){
                if(i%2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        int[] res = {even, odd};
        System.out.println(Arrays.stream(res).boxed().toList());
        System.out.println(even);
        System.out.println(odd);
    }
}
