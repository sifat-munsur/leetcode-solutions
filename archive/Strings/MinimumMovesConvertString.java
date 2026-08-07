
public class MinimumMovesConvertString {
    public static void main(String[] args) {
        String s = "OXOX";
        int res = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'X'){
                res++;
                i += 2;
            }
        }
        System.out.println(res);
    }
}
