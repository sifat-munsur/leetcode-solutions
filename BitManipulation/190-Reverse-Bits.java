package PrefixSum.BitManipulation;

class ReverseBits {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;
        for(int i=0; i<4; i++){
            int last = n&1;
            result = result << 1;
            result = result | last;
            n = n >> 1;
        }
        System.out.println(result);
    }
}
