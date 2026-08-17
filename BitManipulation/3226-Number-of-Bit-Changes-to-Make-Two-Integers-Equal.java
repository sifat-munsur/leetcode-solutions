package BitManipulation;

class MakeTwoIntegersEqual {
    public static void main(String[] args) {
        int n = 14, k = 13;
        int count = 0;
        if(n==k){
            System.out.println(count);
        }
        while(n != k){
            int bitOfN = n&1;
            int bitOfK = k&1;
            System.out.println("n= "+bitOfN+"   k= "+bitOfK);
            if(bitOfN == 0 && bitOfK == 1){
                System.out.println(-1);
                break;
            }
            if(bitOfK != bitOfN && bitOfN == 1){
                count++;
            }
            n = n >> 1;
            k = k >> 1;
        }
        System.out.println(count);
    }
}
