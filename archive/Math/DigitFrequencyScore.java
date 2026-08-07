
public class DigitFrequencyScore {
    public static void main(String[] args) {
        int n = 122;
        int sum = 0;
        while(n>0){
            int digit = n%10;            
            n = n/10;
            sum += digit;
        }
        System.out.println(sum);
    }
}
