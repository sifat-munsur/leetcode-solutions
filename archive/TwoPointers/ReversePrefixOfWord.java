
public class ReversePrefixOfWord {

    public static void reverse(char[] arr, int i, int j){
        while(i<j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char[] arr = word.toCharArray();
        char ch = 'd';
        for(int x=0; x<word.length(); x++){
            if(ch == arr[x]){
                reverse(arr, 0, x);
                break;
            }
        }
        System.err.println(new String(arr));

    }
}
