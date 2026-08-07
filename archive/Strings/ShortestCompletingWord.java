package archive.Strings;
import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
        HashMap<Character,Integer> licenseMap = new HashMap<>();
        for(char c: licensePlate.toLowerCase().toCharArray()){
            if(c >= 'a' && c <= 'z'){
                licenseMap.put(c, licenseMap.getOrDefault(c,0)+1);
            }
        }
        
        String result = null;
        for(String word:words){
            Map<Character, Integer> count = new HashMap<>();
            for (char c : word.toCharArray()) {
                count.put(c, count.getOrDefault(c, 0) + 1);
            }
            boolean isValid = true;

            for (char key : licenseMap.keySet()) {
                if (count.getOrDefault(key, 0) < licenseMap.get(key)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }

        System.out.println(result);

    }
}
