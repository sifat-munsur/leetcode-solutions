package BitManipulation;

class BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        long left = 5, right = 7;
        int shift = 0;
        while(left+1 !=right){
            left = left >> 1;
            right = right >> 1;
            shift++;
        }
        System.out.println(left << shift);
    }
}
