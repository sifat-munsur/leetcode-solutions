
public class ReverseVowelsOfAString {

    public static boolean isVowel(char c){
        char a = Character.toLowerCase(c);
        return a=='a' || a=='e' || a=='i' || a=='o' || a=='u';
    }
    public static void main(String[] args) {
        String s = "IceCreAm";
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(!isVowel(arr[i])){
                    i++;
                }
            else if(!isVowel(arr[j])){
                j--;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
    }
}
