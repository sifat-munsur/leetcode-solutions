
public class ValidBoomerang {
    public static void main(String[] args) {
     
        int[][] points = {{1,1},{2,2},{3,3}};

        double m1 = ((points[1][1] - points[0][1]) / (points[1][0] - points[0][0]));
        double m2 = ((points[2][1] - points[0][1]) / (points[2][0] - points[0][0]));

        System.out.println(m1!=m2);


        // double area = 0.5 * ((points[0][0] * (points[1][1] - points[2][1])) -
        //               (points[1][0] * (points[0][1] - points[2][1])) +
        //               (points[2][0] * (points[0][1] - points[1][1])));        
        // System.out.println(Math.abs(area));        

    }


    
}
