
import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        String s = "10101";
        List<Integer> list = new ArrayList<>();
        int count = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else{
                list.add(count);
                count = 1;
            }                
        }
        list.add(count);
        int res = 0;
        for(int i=1; i<list.size(); i++){
            res += Math.min(list.get(i), list.get(i-1));
        }
        System.out.println(res);
        System.out.println(list);

    }
}
