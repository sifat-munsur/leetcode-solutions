

public class GuessNumberHigherOrLower {
    public int pick = 2;
    public int isValid(int x){
        if(pick>x){
            return 1;
        }
        else if(pick < x){
            return -1;
        }
        else{
            return 0;
        }
    }
}

class Solution extends GuessNumberHigherOrLower{
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isValid(mid) == 1) {
                left = mid+1;
            } else if(isValid(mid) == -1) {
                right = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=3;
        Solution obj = new Solution();
        System.out.println(obj.guessNumber(n));
    }
}
