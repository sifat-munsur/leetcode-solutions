package Arrays;

class TeemoAttacking {
    public static void main(String[] args) {
        int[] timeSeries = {1,2};
        int duration = 2;
        int sum = 0;
        for(int i=0; i<timeSeries.length-1; i++){
            sum += Math.min(duration, timeSeries[i+1]-timeSeries[i]);
        }
        sum += duration;
        System.out.println(sum);
    }
}
