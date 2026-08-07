package archive.Math;

public class WaterBottles {
    public static void main(String[] args) {
        int numBottles = 9, numExchange = 3;
        int emptyBottle = 9;
        int res = 0;
        while(emptyBottle >= numExchange){
            int exchange= emptyBottle/numExchange;
            emptyBottle = emptyBottle - (exchange * numExchange) + exchange;
            res += exchange;
        }
        System.out.println(numBottles+res);
    }
}
