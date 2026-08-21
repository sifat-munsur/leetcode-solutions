package BitManipulation;

class SmallestNumberSetBits {
    public static void main(String[] args) {
        int n = 5;
        int res = 0;
        while(n>0){
            n = n >> 1;
            res = (res << 1) | 1;
        }
        System.out.println(res);
    }
}
