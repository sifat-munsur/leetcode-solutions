
public class LemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        int five = 0;
        int ten =0;
        boolean possible = true;
        for(int i=0; i<bills.length; i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five > 0){
                   ten++;
                   five--; 
                }
                else{
                    possible = false;
                }
            }
            else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }
                else if(five-3 >0){
                    five -= 3;
                }
                else{
                    possible = false;
                }
            }
        }
        System.out.println(possible);
    }
}
