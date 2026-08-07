
import java.util.*;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int n = 701;        
        List<Character> list = new ArrayList<>();
        int rem = Integer.MAX_VALUE;
        while(n > 0){
            n -= 1;
            rem = n % 26;
            char c = (char) ('a'+rem-32);
            list.add(c);
            n = n/26;
        }
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
