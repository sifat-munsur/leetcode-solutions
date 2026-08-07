package archive.TwoPointers;
public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while(i<word1.length() && j<word2.length()){
            sb.append(arr1[i]);
            sb.append(arr2[j]);
            i++;
            j++;
        }
        while(i < word1.length()){
            sb.append(arr1[i]);
            i++;
        }

        while(j < word2.length()){
            sb.append(arr2[j]);
            j++;
        }
        System.out.println(sb.toString());


    }
}
