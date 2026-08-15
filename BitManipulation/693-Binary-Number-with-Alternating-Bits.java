package BitManipulation;

class BinaryNumberAlternating{
    public static void main(String[] args) {
        int n = 7;
        int lastBit = n&1;
        int x = n >> 1;
        boolean different = true;
        while(x>0){
            int currLastBit = x&1;
            if(lastBit != currLastBit){
                lastBit = currLastBit;
            }else{
                different = false;
            }
            x = x >> 1;
        }
        System.out.println(different);
    }
}
