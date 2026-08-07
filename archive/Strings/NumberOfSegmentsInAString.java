package archive.Strings;
public class NumberOfSegmentsInAString {
    public static void main(String[] args) {
        String s = "   ";
        int res = 0;
        for(char ch: s.toCharArray()){
            if(ch == ' '){
                res++;
            }
        }
        if(!s.isBlank()){
            System.out.println(res+1);
        }
        else{
            System.out.println(0);
        }
        
    }
}
