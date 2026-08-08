package Sorting;

import java.util.Arrays;

class SortPeople {
    

    public static void main(String[] args) {
        String[] names = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
        int[] heights = {17233,32521,14087,42738,46669,65662,43204,8224};

        for(int i=0; i<heights.length-1; i++){
            for(int j=0; j<heights.length-1-i; j++){
                if(heights[j] < heights[j+1]){
                    int swap = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = swap;
                    String temp = names[j];
                    names[j] = names[j+1];
                    names[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
    }
}
