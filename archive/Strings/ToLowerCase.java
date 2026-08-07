
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Hello";
        char[] charArray = s.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(charArray[i] >= 'A' && charArray[i] <= 'Z'){
                charArray[i] = (char) (s.charAt(i)+32);
            }
        }
        s = new String(charArray);
        System.out.println(s);
    }
}
