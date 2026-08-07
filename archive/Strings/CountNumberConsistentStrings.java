
public class CountNumberConsistentStrings {
    public static void main(String[] args) {
        String allowed = "fstqyienx";
        String[] words = {"n","eeitfns","eqqqsfs","i","feniqis","lhoa","yqyitei","sqtn","kug","z","neqqis"};
        int result = words.length;
        for(int i=0; i<words.length; i++){
            for(char c: words[i].toCharArray()){
                if(allowed.indexOf(c) == -1){
                    result -= 1;
                    break;
                }
            }
        }
        System.err.println(result);
    }
}
