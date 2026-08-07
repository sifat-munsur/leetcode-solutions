package archive.TwoPointers;
public class ReverseStringPrefix {
    public static void main(String[] args) {
        String s = "xyz";
        int k = 3;
        char[] arr = s.toCharArray();
        int i = 0;
        int j = k-1;
        while(i<j){
            char swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
        System.out.println(new String(arr));
    }
}
