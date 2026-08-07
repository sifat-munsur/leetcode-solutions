package archive.SlidingWindow;

public class VowelsInASubstringOfGivenLength {

    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // handle uppercase
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int count = 0;
        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int maxVowel = count;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i-k))){
                count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxVowel = Math.max(maxVowel, count);
        }
        System.out.println(maxVowel);

    }
}
