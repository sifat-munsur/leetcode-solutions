
public class ValidDigitNumber {
    public static void main(String[] args) {
        int n = 5;
        int x = 1;
        boolean valid = false;
        while(n>0){
            int digit = n%10;            
            if(digit==x && n<=9){
                System.out.println(false);
            }
            if(digit==x){
                valid = true;
            }
            n = n/10;
        }
        System.out.println(valid);

    }
}
