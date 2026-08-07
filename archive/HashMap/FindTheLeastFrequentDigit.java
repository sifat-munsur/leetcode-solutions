package archive.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTheLeastFrequentDigit {
    public static void main(String[] args) {
        int n = 723344511;
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();
        while(n>0){
            int digit = n%10;
            n = n/10;
            arr[digit]++;
            list.add(digit);
        }
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num != 0 && num < min) {
                min = num;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (arr[i] == min) {
                System.out.println(i);
                break;
            }
        }
        System.out.println(min);
        System.out.println(Arrays.stream(arr).boxed().toList());
    }
}
