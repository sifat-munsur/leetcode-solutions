
public class EarliestTimeFinishOneTask {
    public static void main(String[] args) {
        int[][] tasks = {{1,6},{2,3}};
        int takes = Integer.MAX_VALUE;
        for(int i=0; i<tasks.length; i++){
            int value = tasks[i][0] + tasks[i][1];
            takes = Math.min(takes, value);
        }
        System.out.println(takes);
    }
}
