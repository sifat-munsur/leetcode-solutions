package archive.Strings;
public class FinalValueVariableAfter {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X","X--"};
        int res = 0;
        for(int i=0; i<operations.length; i++){
            String temp = operations[i];
            if(temp.equals("--X") || temp.equals("X--")){
                res--;
            }
            else{
                res++;
            }
        }
        System.out.println(res);
    }
}
