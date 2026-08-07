package archive.TwoPointers;
public class ReverseStringII {
    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;
        char[] arr = s.toCharArray();
        for(int x=0; x<s.length(); x+=2*k){
            int i=x;
            int j = Math.min(x+k-1, s.length()-1);
            while(i<j){
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
