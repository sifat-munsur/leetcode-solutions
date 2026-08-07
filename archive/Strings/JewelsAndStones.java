package archive.Strings;
import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: stones.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int res = 0;
        for(char c: jewels.toCharArray()){
            if(map.containsKey(c)){
                res += map.get(c);
            }
        }
        System.out.println(res);
        System.out.println(map);
    }
}
