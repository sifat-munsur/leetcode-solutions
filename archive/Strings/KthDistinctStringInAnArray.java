package archive.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KthDistinctStringInAnArray {
    public static void main(String[] args) {
        String[]  arr = {"a","b","a"};
        int k = 3;
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String c: arr){
            if(map.get(c) == 1){
                list.add(c);
            }
        }
        if(list.size() >= k){
            System.out.println(list.get(k-1));
        }
        else{
            System.out.println("");
        }
        
    }
}
