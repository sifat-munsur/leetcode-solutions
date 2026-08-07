package archive.TwoPointers;
public class MaximumEnemyCaptured {
    public static void main(String[] args) {
        int[] forts = {0,-1,-1,0,-1};
        int start = 0;
        int end = 0;
        int res = 0;
        int store = 0;
        for(int i=0; i<forts.length; i++){
            if(forts[i] != 0){
                
                if(store+forts[i] == 0){
                    if((end-start) > res){
                        res = end-start;
                        System.out.println(res);
                    }
                }
                start = i;
                store = forts[i];
            }
            end = i;
        }
        System.out.println(res);
    }
}
