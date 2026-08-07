package archive.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob";
        String[] banned = {""};
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c: paragraph.toCharArray()){
            if(!Character.isLetter(c)){
                if(sb.length()>0){
                    list.add(sb.toString().toLowerCase());
                    sb.setLength(0);
                }
            }
            else{
                sb.append(c);
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString().toLowerCase());
        }
        HashMap<String,Integer> map = new HashMap<>();
        for(String s: list){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        HashSet<String> bannedWord = new HashSet<>();
        for(String word: banned){
            bannedWord.add(word.toLowerCase());
        }
        int count = 0;
        String res = "";
        for(String s: list){
            if(!bannedWord.contains(s)){
                if(map.get(s) > count){
                    count = map.get(s);
                    res = s;
                }
            }
        }
        System.out.println(res);
        System.out.println(count);
        System.out.println(map);
        System.out.println(list);
    }
}
