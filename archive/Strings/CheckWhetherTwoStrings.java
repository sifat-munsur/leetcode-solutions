package archive.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckWhetherTwoStrings {
    public static void main(String[] args) {

        String word1 = "zzzyyy";
        String word2 = "iiiiii";

        HashMap<Character,Integer> countWord1 = new HashMap<>();
        HashMap<Character,Integer> countWord2 = new HashMap<>();
        for(char c: word1.toCharArray()){
            countWord1.put(c, countWord1.getOrDefault(c, 0)+1);
        }
        for(char c: word2.toCharArray()){
            countWord2.put(c, countWord2.getOrDefault(c, 0)+1);
        }

        List<Character> list = new ArrayList<>();
        list.addAll(countWord1.keySet());
        list.addAll(countWord2.keySet());
        boolean valid = true;
        System.out.println(countWord2);
        for(char c: list){
            int a = countWord1.containsKey(c) ? countWord1.get(c) : 0;
            int b = countWord2.containsKey(c) ? countWord2.get(c) : 0;
            if(Math.abs(a-b) > 3){
                valid = false;
            }
            System.out.println(Math.abs(a-b));
        }

        System.out.println(valid);


    }
}
