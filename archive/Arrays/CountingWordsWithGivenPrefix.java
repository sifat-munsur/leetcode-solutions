
public class CountingWordsWithGivenPrefix {
    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "code";
        int count= 0;
        for(String s: words){
            if(s.indexOf(pref) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
