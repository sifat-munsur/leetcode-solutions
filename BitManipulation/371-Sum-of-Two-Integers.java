package BitManipulation;

class SumofTwoIntegers {
    public static void main(String[] args) {
        int a = 1, b = 2;
        while(b != 0){
            int sum = a^b;
            int carry = (a&b) << 1;
            a = sum;
            b = carry;
        }
        System.out.println(a);
    }
}
