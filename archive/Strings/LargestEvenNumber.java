package archive.Strings;
public class LargestEvenNumber {
    public static void main(String[] args) {
        String s = "221";
        char[] arr = s.toCharArray();
        int lastIndex=0;
        String result = "";
        for(int i=s.length()-1; i>=0; i--){
            if(arr[i]-'0' == 2){
                lastIndex=i;
                result = s.substring(0, lastIndex+1);
                break;
            }
        }
        System.out.println(lastIndex);
        System.out.println(result);
        System.out.println(s.substring(0, lastIndex+1));
    }
}
