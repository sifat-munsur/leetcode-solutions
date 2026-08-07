package archive.TwoPointers;
public class FirstMatchingCharacter {
    public static void main(String[] args) {
        String s = "c";
        int i = 0;
        int n = s.length();
        while(i<n){
            if(s.charAt(i) == s.charAt(n-i-1)){
                System.out.println(i);
            }
            else{
                i++;
            }
        }
    }
}
