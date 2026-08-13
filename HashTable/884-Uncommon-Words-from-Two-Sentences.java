package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class UncommonWordsSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for(String word: words1){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        for(String word: words2){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        List<String> result = new ArrayList<>();
        for(String key: map.keySet()){
            if(map.get(key) == 1){
                result.add(key);
            }
        }
        System.out.println(result);
    }
}
