
public class CountOperationsObtainZero {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
        int count = 0;
        while(num1 !=0 && num2 !=0){
            int max = Math.max(num1, num2);
            int min = Math.min(num1, num2);
            num1 = max-min;
            num2 = min;
            count++;
        }
        System.out.println(count);
    }
}
