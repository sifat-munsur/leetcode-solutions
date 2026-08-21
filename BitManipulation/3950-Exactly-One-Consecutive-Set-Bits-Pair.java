package BitManipulation;

class ExactlyOneConsecutiveSetBitsPair {
    public static void main(String[] args) {
        int n = 11;
        int previousBit = 0;
        int count = 0;
        while(n>0){
            int currentBit = n&1;
            if(previousBit==1 && currentBit==1){
                count++;
            }
            previousBit = currentBit;
            n = n >> 1;
        }
        if(count==1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
