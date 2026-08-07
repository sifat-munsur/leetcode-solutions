

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==0 && nums[j]!=0){
                    int swap = nums[i];
                    nums[i] = nums[j];
                    nums[j] = swap;
                    break;
                }
            }            
        }

        for(int i: nums){
            System.out.println(i);
        }




        // List<Integer> list = new ArrayList<>();
        // for(int i: nums){
        //     list.add(i);
        // }
        // for(int i=0; i<list.size(); i++){
        //     if(list.get(i) == 0){
        //         list.remove(i);
        //         list.add(0);
        //     }
        // }

        // System.out.println(list);
    }
}
