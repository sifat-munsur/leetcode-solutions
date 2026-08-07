
public class BuddyStrings {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "ab";

        char[] arrOfS = s.toCharArray();
        char[] arrOfGoal = goal.toCharArray();

        int firstIndex = Integer.MAX_VALUE;
        int secondIndex = 0;

        if(s.equals(goal)){
            System.out.println(true);
        }

        for(int i=0; i<arrOfS.length; i++){
            if(arrOfS[i]!=arrOfGoal[i]){
                firstIndex = Math.min(firstIndex, i);
                secondIndex = Math.max(secondIndex, i);
            }
        }
        if(firstIndex>=0 && secondIndex>0){
            char swap = arrOfS[firstIndex];
            arrOfS[firstIndex] = arrOfS[secondIndex];
            arrOfS[secondIndex] = swap;
            if(new String(arrOfS).equals(goal)){
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }

        System.out.println(firstIndex);
        System.out.println(secondIndex);


    }
}
