package HashTable;

import java.util.HashSet;
import java.util.Set;

class UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
        "--.","....","..",".---","-.-",".-..","--","-.","---",
        ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] words = {"gin", "zen", "gig", "msg"};
        Set<String> set = new HashSet<>();
        for(String word: words){
            StringBuilder sb = new StringBuilder();
            for(char c: word.toCharArray()){
                int idx = c-'a';
                sb.append(morse[idx]);
            }
            set.add(sb.toString());
        }
        System.out.println(set.size());
    }
}
