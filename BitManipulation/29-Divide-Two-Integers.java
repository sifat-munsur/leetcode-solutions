package BitManipulation;

class DivideTwoIntegers {
    public static void main(String[] args) {
        int dividend = 10, divisor = 3;
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            System.out.println(Integer.MAX_VALUE);
            return;
        }
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long quotient = 0;
        for(int i=31; i>=0; i--){
            if((b << i) <= a){
                a -= (b<<i);
                quotient += (1L << i);
            }
        }
        if(negative){
            quotient = -quotient;
        }
        System.out.println((int) quotient);
    }
}
