
public class ReverseLetters {
    public static void main(String[] args) {
        String s = ")ebc#da@f(";
        char[] arr = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
            }
            else{
                char swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        i=0;
        j= s.length()-1;
        while(i<j){
            if(Character.isLetter(arr[i])){
                i++;
            }
            else if(Character.isLetter(arr[j])){
                j--;
            }
            else{
                char swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        System.out.println(new String(arr));
    }
}
