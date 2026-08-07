package archive.Strings;
import java.util.ArrayList;
import java.util.List;

public class CheckIfNumbersAre {
    public static void main(String[] args) {
        String s = "hello world 5 x 5";
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if (Character.isDigit(arr[i])) {
                sb.append(arr[i]);
            } else {
                if (sb.length() > 0) {
                    list.add(Integer.parseInt(sb.toString()));
                    sb.setLength(0);
                }
            }
        }
        if (sb.length() > 0) {
            list.add(Integer.parseInt(sb.toString()));
        }
        System.out.println(list);
        boolean valid = true;
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i) >= list.get(i+1)){
                valid = false;
            }
        }
        System.out.println(valid);
    }
}
