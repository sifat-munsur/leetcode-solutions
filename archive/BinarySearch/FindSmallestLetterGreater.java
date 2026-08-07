package archive.BinarySearch;
public class FindSmallestLetterGreater {
    public static void main(String[] args) {
        
        Character[] letters = {'a', 'c', 'e', 'g', 'i'};
        char target = 'h';
        char result = letters[0];
        int left = 0;
        int right = letters.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(letters[mid] > target){
                result = letters[mid];
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        System.out.println(result);
    }
}
