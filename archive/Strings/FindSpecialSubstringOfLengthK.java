package archive.Strings;
public class FindSpecialSubstringOfLengthK {
    public static void main(String[] args) {
        String s = "dii";
        int k = 1;
        int count = 1;
        boolean valid = false;
        for(int i=0; i<s.length(); i++){
             if(i > 0 && s.charAt(i) == s.charAt(i - 1)){
                count++;
            } else {
                count = 1;
            }
            if(count==k){
                boolean before = (i-k < 0) || s.charAt(i)!=s.charAt(i-k);
                boolean after = (i+1 >= s.length()) || s.charAt(i)!=s.charAt(i+1);
                if(before && after){
                    valid = true;
                    break;
                }
            }           
        }
        System.out.println(valid);


    }
}
