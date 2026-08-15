package Geometry;

import java.util.HashMap;

class MaxPointsOnALine {
    public static void main(String[] args) {
        // int[][] points = {{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}};
        int[][] points = {{1,1}};
        if(points.length<=2){
            System.out.println(points.length);
        }
        int max = -1;
        for(int i=0; i<points.length; i++){
            HashMap<Double, Integer> map = new HashMap<>();
            for(int j=i+1; j<points.length; j++){
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                double slope;
                if (dy == 0) {
                    slope = 0.0;
                }
                else if (dx == 0) {
                    slope = Double.POSITIVE_INFINITY;
                }
                else{
                    slope = (double) dy/dx;
                }
                int count = map.getOrDefault(slope, 0)+1;
                map.put(slope, count);
                max = Math.max(max, count);
            }
        }
        System.out.println(max);
    }
}
