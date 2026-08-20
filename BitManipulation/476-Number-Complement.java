package BitManipulation;

class NumberComplement {
    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        int pos = 0;
        while(n>0){
            int bit = n&1;
            int flippedBit = bit^1;
            res = res | (flippedBit << pos);
            pos++;
            n = n >> 1;
        }
        System.out.println(res);
    }
}
