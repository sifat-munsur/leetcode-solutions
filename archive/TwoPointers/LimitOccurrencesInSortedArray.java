package archive.TwoPointers;

public class LimitOccurrencesInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;

        int i=0;
        for(int j=0; j<nums.length; j++){
            if(i<k || nums[j] != nums[i-k]){
                nums[i] = nums[j];
                i++;
            }
        }

        for(int x=0; x<i; x++){
            System.out.print(nums[x]+" ");
        }





        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i: nums){
        //     map.put(i, map.getOrDefault(i,0)+1);
        // }
        // List<Integer> list = new ArrayList<>();
        // for(int key: map.keySet()){
        //     if(map.get(key) >= k){
        //         list.addAll(Collections.nCopies(k, key));
        //     }
        //     else{
        //         list.addAll(Collections.nCopies(map.get(key), key));
        //     }
        // }
        // Collections.sort(list);
        // System.out.println(list);

    }
}
