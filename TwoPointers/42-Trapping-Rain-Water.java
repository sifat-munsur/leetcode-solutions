package TwoPointers;

import java.util.Arrays;

class TrappingRainWater {
    public static void main(String[] args) {
        int[] height = {4,2,0,3,2,5};
                     // 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3
                     // 3, 3, 3, 3, 3, 3, 3, 3, 2, 2, 2, 1
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        int sum = 0;
        for(int i=0; i<n; i++){
            int diffLeft = height[i]-leftMax[i];
            int diffRight = height[i]-rightMax[i];
            if(diffLeft < 0 && diffRight < 0){
                sum += Math.min(-diffLeft, -diffRight);
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.stream(leftMax).boxed().toList());
        System.out.println(Arrays.stream(rightMax).boxed().toList());

    }
}
