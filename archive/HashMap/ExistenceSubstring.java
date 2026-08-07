
public class ExistenceSubstring {
    public static void main(String[] args) {
        String s = "leetcode";
        //edocteel
        String reversed = new StringBuilder(s).reverse().toString();
        boolean exist = false;
        for(int i=0; i<s.length()-2; i++){
            String sub = s.substring(i, i+2);
            if(reversed.contains(sub)){
                System.out.println(sub);
                exist = true;
                break;
            }
        }
        System.out.println(exist);
    }
}
