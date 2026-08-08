package BinarySearch;

class UnplacedFruits{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean[] used = new boolean[baskets.length];
        int res = 0;
        for(int i=0; i<fruits.length; i++){
            for(int j=0; j<baskets.length; j++){
                if(fruits[i] <= baskets[j] && used[j]!=true){
                    used[j] = true;
                    break;
                }
            }
        }
        for(int x=0; x<used.length; x++){
            if(used[x]==false){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        UnplacedFruits obj = new UnplacedFruits();
        int[] fruits = {3,6,1};
        int[] baskets = {3,5,4};
        System.out.println(obj.numOfUnplacedFruits(fruits, baskets));

    }
}



//  Solved using binary search;


// class Solution {
//     public int numOfUnplacedFruits(int[] fruits, int[] baskets) {

//         Arrays.sort(baskets);
//         boolean[] used = new boolean[baskets.length];
//         int unplaced = 0;

//         for (int fruit : fruits) {
//             int idx = lowerBound(baskets, fruit);
//             while (idx < baskets.length && used[idx]) {
//                 idx++;
//             }
//             if (idx < baskets.length) {
//                 used[idx] = true;
//             } else {
//                 unplaced++;
//             }
//         }
//         return unplaced;
//     }

//     private int lowerBound(int[] arr, int target) {
//         int left = 0, right = arr.length - 1;
//         int ans = arr.length;
//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             if (arr[mid] >= target) {
//                 ans = mid;
//                 right = mid - 1;
//             } else {
//                 left = mid + 1;
//             }
//         }
//         return ans;
//     }
// }