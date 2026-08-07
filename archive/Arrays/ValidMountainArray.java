package archive.Arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,5};
        int n = arr.length;
        int i = 0;
        while(i+1 < n && arr[i] < arr[i+1]){
            i++;
        }
        if(i==0 || i == n-1){
            System.out.println(false);
        }
        while(i+1 < n &&  arr[i] > arr[i+1]){
            i++;
        }
        System.out.println(i == n-1);
    }
}
