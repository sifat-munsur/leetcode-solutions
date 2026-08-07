package archive.Strings;
import java.util.Arrays;
import java.util.HashMap;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        HashMap<Integer, Character> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(indices[i], s.charAt(i));
        }
        char[] result = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            result[i] = map.get(i); 
        }

        System.out.println(Arrays.toString(result));
    }
}
