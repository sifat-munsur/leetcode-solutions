
public class Unique3DigitEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {1,2,3,4};
        int[] freq = new int[10];
        for(int i: digits){
            freq[i]++;
        }
        int count = 0;

        for(int i=100; i<999; i=i+2){
            int a = i/100;
            int b = (i/10)%10;
            int c = i%10;
            int[] temp = new int[10];
            temp[a]++;
            temp[b]++;
            temp[c]++;
            boolean valid = true;
            for(int j=0; j<10; j++){
                if(temp[j]>freq[j]){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        System.out.println(count);

    }
}
