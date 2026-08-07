
public class CountPrefixesGivenString {
    public static void main(String[] args) {
        String[] words = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        int count = 0;
        for(int i=0; i<words.length; i++){
            String str = words[i];
            if(s.indexOf(str) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
