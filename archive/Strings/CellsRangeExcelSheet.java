
import java.util.*;

public class CellsRangeExcelSheet {
    public static void main(String[] args) {
        String s = "K1:L2";
        List<String> list = new ArrayList<>();
        for(char c=s.charAt(0); c<=s.charAt(3); c++){
            for(int i =s.charAt(1)-'0'; i<=s.charAt(4)-'0'; i++ ){
                list.add(""+c+i);
            }
        }
        System.out.println(list);
    }
}
