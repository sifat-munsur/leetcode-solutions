package BitManipulation;

class MinimumNumberFlipsReverseBinaryString {
    public static void main(String[] args) {
        int n = 10;
        String sb = Integer.toBinaryString(n);
        int left =0;
        int right = sb.length()-1;
        int res = 0;
        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)){
                res++;
            }
            right--;
            left++;
        }
        System.out.println(2*res);
    }
}
