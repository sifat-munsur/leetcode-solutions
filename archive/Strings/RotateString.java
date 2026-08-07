package archive.Strings;
public class RotateString {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        // s = s+s;
        // System.out.println(s.contains(goal));

        String temp = s;
        System.out.println(temp);
        for(int i=0; i<s.length(); i++){
           temp = temp.substring(1)+temp.charAt(0);
           if(temp.equals(goal)){
                System.out.println(true);
                break;
           }
        }
    }
}
