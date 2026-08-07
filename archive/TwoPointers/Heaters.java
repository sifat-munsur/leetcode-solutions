
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Heaters {
    public static void main(String[] args) {
        int[] houses = {1,2,3,4};
        int[] heaters = {1,4};
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<houses.length; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<heaters.length; j++){
               int dist = Math.abs(houses[i] - heaters[j]);
               min = Math.min(min, dist);
            }
            list.add(min);
        }
        System.out.println(Collections.max(list));
    }
}
