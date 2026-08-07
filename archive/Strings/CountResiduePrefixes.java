package archive.Strings;
public class CountResiduePrefixes {
    public static void main(String[] args) {
        String s = "abc";
        boolean[] seen = new boolean[26];
        int distinct = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!seen[c-'a']){
                seen[c-'a'] = true;
                distinct++;
            }
            int length = i+1;
            if(distinct == (length%3)){
                count++;
            }
        }
        System.out.println(count);
    }
}
