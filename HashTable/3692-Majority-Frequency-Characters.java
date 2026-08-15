package HashTable;

import java.util.HashMap;

class MajorityFrequencyCharacters {
    public static void main(String[] args) {
        String s = "pfpfgi";
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int val: map.values()){
            freq.put(val, freq.getOrDefault(val, 0)+1);
        }
        int maxFreq = -1;
        int maxKey = -1;
        for(int key: freq.keySet()){
            int currentFreq = freq.get(key);
            if(currentFreq > maxFreq || (currentFreq == maxFreq && key > maxKey)){
                maxFreq = currentFreq;
                maxKey = key;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch: map.keySet()){
            if(maxKey == map.get(ch)){
                sb.append(ch);
            }
        }
        System.out.println(map);
        System.out.println(freq);
        System.out.println(maxFreq);
        System.out.println(maxKey);
        System.out.println(sb);
    }
}
