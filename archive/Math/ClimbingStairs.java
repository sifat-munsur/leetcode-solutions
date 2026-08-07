
public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 8;
        int prev2 = 1;
        int prev1 = 2;
        for(int i=3; i<=n; i++){
            int current = prev1+prev2;
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println(prev1);
    }
}
