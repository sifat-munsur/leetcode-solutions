
public class TwoStringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s: word1){
            sb1.append(s);
        }
        for(String s: word2){
            sb2.append(s);
        }

        if(sb1.toString().equals(sb2.toString())){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
