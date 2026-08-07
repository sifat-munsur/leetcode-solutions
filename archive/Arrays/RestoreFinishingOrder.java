
import java.util.Arrays;

public class RestoreFinishingOrder {
    public static void main(String[] args) {

        int[] order = {3, 1, 5, 4, 2};
        int[] friends = {2, 5};

        int n = order.length;
        boolean[] isFriend = new boolean[n + 1]; // racer IDs are 1..n

        for (int f : friends) {
            isFriend[f] = true;
        }

        System.out.println(Arrays.toString(isFriend));

        int[] result = new int[friends.length];
        int index = 0;

        for (int racer : order) {
            if (isFriend[racer]) {
                result[index++] = racer;
            }
        }



        // int[] order = {3,1,5,4,2};
        // int[] friends = {2,5};
        // int index = 0;
        // int result[] = new int[friends.length];
        // HashSet<Integer> set = new HashSet<>();
        // for(int i: friends){
        //     set.add(i);
        // }
        // for(int i: order){
        //     if(set.contains(i)){
        //         result[index++] = i;
        //     }
        // }
        // System.out.println(Arrays.toString(result));

    }
}
