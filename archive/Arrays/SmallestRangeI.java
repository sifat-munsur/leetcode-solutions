package archive.Arrays;

public class SmallestRangeI {
    public static void main(String[] args) {
        int[] nums = {1,3,6};
        int k = 3;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(int i: nums){
            maxValue = Math.max(i, maxValue);
            minValue = Math.min(i, minValue); 
        }
        maxValue = maxValue-k;
        minValue = minValue+k;

        if(minValue >= maxValue){
            System.out.println(0);
        }

        System.out.println(maxValue-minValue);

    }
}
