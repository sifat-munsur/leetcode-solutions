
public class WeightedWordMapping {
    public static void main(String[] args) {
        String[]  words = {"a","b","c"}; 
        int[] weights = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        StringBuilder sb = new StringBuilder();
        for(String s: words){
            char[] arr = s.toCharArray();
            int weightCount = 0;
            for(int i=0; i<arr.length; i++){
                weightCount += weights[arr[i]-'a'];
                
            }
            sb.append((char) ('z'-weightCount%26));
            System.out.println((char) ('z'-weightCount%26));
        }
        System.out.println(sb.toString());


    }
}
