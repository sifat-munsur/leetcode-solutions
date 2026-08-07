package archive.TwoPointers;
import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
            } else {
                sb.append(c);
            }
        }
        if (sb.length() > 0) {
            list.add(sb.toString());
        }
        for(int x=0; x<list.size(); x++){
            String str = list.get(x);
            char[] arr = str.toCharArray();
            int i = 0;
            int j = str.length()-1;
            while(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            list.set(x, new String(arr));
        }
        System.out.println(list);
        System.out.println(String.join(" ", list));
    }
}
