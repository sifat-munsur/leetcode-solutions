package archive.SlidingWindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        int k = p.length();
        Set<Character> anagram = new HashSet<>();
        Set<Character> window = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(char c: p.toCharArray()){
            anagram.add(c);
        }
        for(int i=0; i<k; i++){
            window.add(s.charAt(i));
        }
        
        for(int i=0; i<s.length()-k; i++){
            if(anagram.equals(window)){
                list.add(i);
            }
            System.out.println(window);
            if(window.contains(s.charAt(i+k))){
                continue;
            }
            else{
                window.remove(s.charAt(i));
                window.add(s.charAt(i+k));
            }
        }

        System.out.println(list);
        System.out.println(anagram.equals(window));
    }
}
