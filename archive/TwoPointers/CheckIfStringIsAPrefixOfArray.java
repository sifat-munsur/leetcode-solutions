package archive.TwoPointers;

public class CheckIfStringIsAPrefixOfArray {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            sb.append(words[i]);
            if(s.equals(sb.toString()) && s.contains(words[i])){
                System.out.println(true);
                break;
            }
        }
        System.out.println(sb);
    }
}
