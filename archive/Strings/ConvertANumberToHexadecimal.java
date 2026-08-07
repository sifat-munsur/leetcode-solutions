
public class ConvertANumberToHexadecimal {
    public static void main(String[] args) {
        int num = 26;
        long n = num & 0xffffffffL;
        StringBuilder sb = new StringBuilder();
        while(n>0){
            long mod = n%16;
            if(mod < 10){
                sb.append(mod);
            }else{
                sb.append((char)('a'+ mod-10));
            }
            n = n/16;


        }
        System.out.println(sb.reverse().toString());

    }
}
