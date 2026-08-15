package archive.Strings;

public class CalculateDigitSumString {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        while(s.length() > k){
            StringBuilder sb = new StringBuilder();
            int sum =0 ;
            int count = 0;
            for(int i =0; i<s.length(); i++){
                count++;
                sum += s.charAt(i)-'0';
                if(k==count){
                    sb.append(sum);
                    sum = 0;
                    count = 0;
                }
            }
            if (count > 0) {
                sb.append(sum);
            }
            s = sb.toString();
        }

        System.out.println(s);


    }
}
