package archive.Strings;
public class AddStrings {
    public static void main(String[] args) {
        String num1 = "0";
        String num2 = "0";

        int i = num1.length()-1;
        int j = num2.length()-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i>=0 || j>=0 || carry>0){
             int x = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int y = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = x+y+carry;
            sb.append(sum%10);            
            carry = sum/10;
            i--;
            j--;
        }
        System.out.println(sb.reverse().toString());
    }
}
