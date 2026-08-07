package archive.Strings;
import java.util.*;

public class PositionsOfLargeGroups {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> list = new ArrayList<>();
        int x = 0;
        int HihestIndex = s.length()-1;
        for(int i=0; i<s.length(); i++){
            if(i == HihestIndex || s.charAt(i) != s.charAt(i+1)){
                if(i-x+1 >= 3){
                    list.add(Arrays.asList(x,i));
                }
                x = i+1;
            }            
        }
        System.out.println(list);
    }
}
