package archive.Math;

public class isPowerOfThree {

    // private static int divideByThree(int n){
    //     if(n>=3){
    //         divideByThree(n/3);
    //     }
    //     else{
    //         return n;
    //     }
    // }
    public static void main(String[] args) {
        int n=1;
        int x=0, i=0;
        if(n>0){
            while(x<n){
                x = (int) Math.pow(3, i);
                i++;
            }
        }
        else{
            while(x>=n){
                x = (int) Math.pow(-3, i);
                i++;
            }
        }
        
        System.out.println(x==n);
    }
}
