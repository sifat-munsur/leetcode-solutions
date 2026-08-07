
import java.util.Arrays;

public class ScoreValidator {
    public static void main(String[] args) {
        String[] events = {"W","W","W","W","W","W","W","W","W","W","W"};
        int score = 0; 
        int counter = 0;
        for(String s: events){
            if(s.equals("W")){
                counter++;
                if(counter==10){
                    break;
                }
            }
            else if(s.equals("WD") || s.equals("NB")){
                score++;
            }
            else{
                score += Integer.parseInt(s);
            }
        }
        int[] result = new int[2];
        result[0] = score;
        result[1] = counter;

        System.out.println(Arrays.stream(result).boxed().toList());
    }
}
