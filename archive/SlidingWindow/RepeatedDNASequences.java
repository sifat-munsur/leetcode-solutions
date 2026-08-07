
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RepeatedDNASequences {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Set<String> set = new HashSet<>();
        Set<String> resultSet = new HashSet<>();
         if (s.length() < 10) {
            System.out.println(new ArrayList<>());
        }
        String str = s.substring(0, 10);
        set.add(str);
        for(int i=1; i<s.length()-10; i++){
            str = s.substring(i, i+10);
            if(set.contains(str)){
                resultSet.add(str);
            }
            else{
                set.add(str);
            }
        }
        System.out.println(set);
        System.out.println(resultSet);
    }
}
