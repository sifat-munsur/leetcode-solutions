
public class TrimTrailingVowels {
    public static void main(String[] args) {
        String s = "ea";
        int lastIndex = -1;
        String result = "";
        for(int i=s.length()-1; 0<=i; i--){
            char ch = s.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='u' && ch!='o'){
                lastIndex = i;
                break;
            }
        }
        result = s.substring(0, lastIndex+1);
        System.out.println(result);
    }
}
