package HashTable;

import java.util.HashMap;

class MostFrequentVowelConsonant {
    public static void main(String[] args) {
        String s = "aeiaeia";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        int vowelCount = 0;
        int consnonantCount = 0;
        for(char ch: map.keySet()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowelCount = Math.max(vowelCount, map.get(ch));
            }
            else{
                consnonantCount = Math.max(consnonantCount, map.get(ch));
            }
        }
        System.out.println(map);
        System.out.println(vowelCount+consnonantCount);
    }
}
