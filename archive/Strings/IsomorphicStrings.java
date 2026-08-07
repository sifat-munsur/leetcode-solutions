package archive.Strings;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s = "foo"; 
        String t = "bar";
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        if(sMap.size() != tMap.size()){
            System.out.println(false);
        }
        for(int i=0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            
            if(sMap.containsKey(cs)){
                if(sMap.get(cs) != ct){
                    System.out.println(false);
                }
            }
            else{
                sMap.put(cs,ct);
            }

            if(tMap.containsKey(ct)){
                if(tMap.get(ct) != cs){
                    System.out.println(false);
                }
            }
            else{
                tMap.put(ct,cs);
            }
        }


        

        

    }
}
