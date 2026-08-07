
public class FindFirstPalindromicString {
    public static void main(String[] args) {
        String[] words = {"e","ghi"};
        String res = "";
        boolean exist = false;
        for(int i=0; i<words.length; i++){
            char[] s = words[i].toCharArray();
            int left = 0;
            int right = s.length-1;
            if(s.length == 1){
                res = words[i];
                break;
            }
            while(left<right){
                if(s[left]==s[right]){
                    left++;
                    right--;
                    exist = true;
                }
                else{
                    exist = false;
                    break;
                }
            }
            if(exist){
                res = words[i];
                break;
            }
        }
        System.out.println(res);
    }
}
