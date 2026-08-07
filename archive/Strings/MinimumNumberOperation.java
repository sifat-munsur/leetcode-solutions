package archive.Strings; 
public class MinimumNumberOperation {
    public static void main(String[] args) {
        String current = "11:00";
        String correct = "11:01";

        int currMin = Integer.parseInt(current.substring(0, 2)) * 60
                        + Integer.parseInt(current.substring(3, 5));
                    
        int corrMin = Integer.parseInt(correct.substring(0,2)) * 60 
                     + Integer.parseInt(correct.substring(3, 5));
        int minDiff = Math.abs(currMin-corrMin);
        int res = 0;
        while(minDiff > 0){
            if(minDiff >= 60){
                int temp = minDiff/60;
                res += temp;
                minDiff = minDiff - temp*60;
            }
            else if(minDiff >= 15 && minDiff<60){
                int temp = minDiff/15;
                res += temp;
                minDiff = minDiff - temp*15;
            }
            else if(minDiff >=5 && minDiff <15){
                int temp = minDiff/5;
                res += temp;
                minDiff = minDiff - temp*5;
            }
            else{
                res += minDiff;
                minDiff = minDiff-minDiff;
            }
        }
        System.out.println(res);

    }
}
