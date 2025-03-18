import java.util.*;

public class LongestSubstringTwoDistinct {
    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        int[] count = new int[128]; // ASCII character frequency table
        int distinctCount = 0; // Number of distinct characters

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            if (count[rightChar] == 0) {
                set.add(rightChar);
                distinctCount++;
            }
            count[rightChar]++;

            while (distinctCount > 2) { // More than 2 distinct characters
                char leftChar = s.charAt(left);
                count[leftChar]--;
                if (count[leftChar] == 0) {
                    set.remove(leftChar);
                    distinctCount--;
                }
                left++; // Shrink the window
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "eceba";
        System.out.println("Longest substring length with at most two distinct characters: " + lengthOfLongestSubstringTwoDistinct(s));
    }
}
// Output: Longest substring length with at most two distinct characters: 3