package BitManipulation;

class HammingDistance {
    public static void main(String[] args) {
        int x=1, y=3;
        int count = 0;
        while(x>0 || y>0){
            int bitX = x&1;
            x = x >> 1;
            int bitY = y&1;
            y = y >> 1;
            if(bitX != bitY){
                count++;
            }
        }
        System.out.println(count);
    }
}
