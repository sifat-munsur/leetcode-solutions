package archive.HashMap;

import java.util.HashMap;

public class MaximumLengthSubstring {
    public static void main(String[] args) {
        String s = "bcbbbcba";
        HashMap<Character,Integer> map = new HashMap<>();
        int firstIndex = 0;
        int res = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
            while(map.get(c) == 3){
                char left = s.charAt(firstIndex);
                map.put(left, map.get(left) - 1);
                firstIndex++;                
            }
            res = Math.max(res, i-firstIndex+1);
        }
        System.out.println(res);
    }
}
