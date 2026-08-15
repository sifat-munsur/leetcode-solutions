package PrefixSum;

class CarPooling {
    public static void main(String[] args) {
        int[][] trips = {{2,1,5},{3,3,7}};
        int capacity = 4;
        int[] arr = new int[1000];
        for(int i=0; i<trips.length; i++){
            int passengers = trips[i][0];
            int from = trips[i][1];
            int to = trips[i][2];

            arr[from] += passengers;
            arr[to] -= passengers;
        }
        int currPassenger = 0;
        boolean possible = true;
        for(int i=0; i<arr.length; i++){
            currPassenger += arr[i];
            if(currPassenger > capacity){
                possible = false;
                break;
            }
        }
        System.out.println(possible);
        // System.out.println(Arrays.stream(arr).boxed().toList());
    }
}
