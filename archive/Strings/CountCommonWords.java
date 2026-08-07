package archive.Strings;
import java.util.HashMap;

public class CountCommonWords {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        HashMap<String,Integer> countWord1 = new HashMap<>();
        HashMap<String,Integer> countWord2 = new HashMap<>();
        for(String c: words1){
            countWord1.put(c, countWord1.getOrDefault(c, 0)+1);
        }
        for(String c: words2){
            countWord2.put(c, countWord2.getOrDefault(c, 0)+1);
        }
        int count =0;
        for(String key: countWord1.keySet()){
            int a = countWord1.containsKey(key) ? countWord1.get(key) : 0;
            int b = countWord2.containsKey(key) ? countWord2.get(key) : 0;
            if(a==1 && b==1){
                count++;
            }
        }

        System.out.println(count);

        System.out.println(countWord1);
        System.out.println(countWord2);


    }
}
