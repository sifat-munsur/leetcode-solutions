
public class PowerOofTwo {
   public static void main(String[] args) {
        int n = 1;
        
        if(n >=1 && (n & n-1) == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

   } 
}
