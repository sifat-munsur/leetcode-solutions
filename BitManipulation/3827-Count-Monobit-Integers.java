package BitManipulation;

class CountMonobitIntegers {
    public static void main(String[] args) {
        int n=7;
        int count = 1;
        int x =1;
        while(x<=n){
            count++;
            x = x << 1 | 1;
        }
        System.out.println(count);
    }
}
