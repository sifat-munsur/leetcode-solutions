package archive.Arrays;



import java.util.ArrayList;

public class BaseballGame {
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};

        ArrayList<Integer> res = new ArrayList<>();
        for(String c: ops){
            System.out.println(c);
            if(c.equals("D") && res.size()>0){
                res.add(2 * res.get(res.size() - 1));                
            }
            else if(c.equals("C")){
                res.remove(res.size() - 1);
            }
            else if(c.equals("+")){
                int last = res.get(res.size() - 1);
                int secondLast = res.get(res.size() - 2);
                res.add(last+secondLast);
            }
            else{
                res.add(Integer.parseInt(c));
            }
        }
        int sum = 0;
        for(Integer val: res){
            sum += val;
        }
        System.out.println(sum);
    }    
}

