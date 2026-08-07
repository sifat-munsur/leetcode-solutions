
import java.util.ArrayList;
import java.util.List;

public class NumberSegmentsInAString {
    public static void main(String[] args) {
        String s = "";
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()){
            if(c != ' '){
                sb.append(c);
            }
            else{
                if(sb.length() > 0){
                    list.add(sb.toString());
                }
                sb.setLength(0);
            }
        }
         if(sb.length() > 0){
            list.add(sb.toString());
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
