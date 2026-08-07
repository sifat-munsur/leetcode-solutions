package archive.Strings;
public class RepeatedSubstringPattern {
    public static void main(String[] args) {

        String s = "abac";
        String concatString = s+s;
        String trimmedString = concatString.substring(1, concatString.length()-1);
        
        System.out.println(trimmedString.contains(s));

    }
}
