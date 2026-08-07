
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {

    public static void main(String[] args) {
        int rowIndex = 13;
        List<Integer> list = new ArrayList<>();
        int val = 1;
        list.add(val);
        for(int i=1; i<=rowIndex; i++){
            val = val * (rowIndex-i+1) / i;
            list.add(val);
        }

        System.out.println(list);
        

    }
}
