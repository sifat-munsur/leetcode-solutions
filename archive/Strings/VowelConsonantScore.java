package archive.Strings;
public class VowelConsonantScore {
    public static void main(String[] args) {
        String s = "axeyizou";
        int v = 0;
        int c = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')){
                    v++;
                }
                else{
                    c++;
                }
            }
        }
        if(c>0){
            System.out.println(Math.floorDiv(v, c));
        }
        else{
            System.out.println(0);
        }
        

    }
}
