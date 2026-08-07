package archive.BinarySearch;
public class Sqrt {
    public static void main(String[] args) {
        int x = 9;

        int start = 1;
        int end = x;
        int res = 0;

        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid > x / mid){
                end = mid - 1;
            }
            else if(mid < x / mid){
                res = mid;
                start = mid + 1;
            }
            else{
                System.out.println(mid);
                break;
            }
        }
        System.out.println(res);
    }
}
