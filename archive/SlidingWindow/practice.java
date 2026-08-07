package archive.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class practice {

    // Longest substring without repeating characters
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                System.out.println(s.charAt(left));
                left++;
                // System.out.println(left);
            }
            // System.out.println(s.charAt(right));
            
            seen.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        practice c1 = new practice();
        System.out.println(c1.lengthOfLongestSubstring("repeating"));
        
    }
    
}