
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        List<String> list = Arrays.asList(s.split(" "));
        
        HashMap<Character,String> sMap = new HashMap<>();
        HashMap<String,Character> patternMap = new HashMap<>();

        if(list.size() != pattern.length()){
            System.out.println(false);
        }
        for(int i=0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = list.get(i);
            
            if(sMap.containsKey(ch)){
                if(!sMap.get(ch).equals(word)){
                    System.out.println(false);
                }
            }
            else{
                sMap.put(ch,word);
            }

            if(patternMap.containsKey(word)){
                if(patternMap.get(word) != ch){
                    System.out.println(false);
                }
            }
            else{
                patternMap.put(word,ch);
            }
        }

        
    }
}
