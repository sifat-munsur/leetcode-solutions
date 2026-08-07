package archive.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThousandSeparator {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        if(n==0){
            sb.append(0);
        }
        while(n>0){
            int digit = n%10;
            n = n/10;
            list.add((char) (digit + '0'));
            count++;
            if(count==3 && n>0){
                list.add('.');
                count = 0;
            }
            System.out.println(digit);
        }
        Collections.reverse(list);
        for(char c : list){
            sb.append(c);
        }
        String result = sb.toString();
        System.out.println(result);
    
    }
}
