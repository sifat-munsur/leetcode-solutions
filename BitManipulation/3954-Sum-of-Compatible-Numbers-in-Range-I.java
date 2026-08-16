package BitManipulation;

class CompatibleNumbersRange{
    public static void main(String[] args) {
        int n=1, k=13;
        int x = (k-n) < k && (k-n) > 0 ? 1 : n-k;
        System.out.println(x);
        int sum = 0;
        while(Math.abs(n-x) <= k){
            if((x&n) == 0){
                sum += x;
            }
            x++;
        }
        System.out.println(sum);
    }
}
