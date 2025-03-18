import java.util.HashSet;
import java.util.Set;   
public class Longestsubstring {
    //given a string s, fing the longestsubstring without reapeting charaters
    //input: s = "abcabcbb"
    //output: 3
    // apporack sliding window and hashset
    //use hashset to store the charaters in the window
    //use two pointers to represent the window
    //move the right pointer to the right until we get a repeating charater
    //move the left pointer to the right until we remove the repeating charater
    //update the max length of the window
    //time complexity O(n)
    //space complexity O(n)
    //hashset

        // approach: Sliding window and hashset:
    // Use two pointers (left and right to dine the window
    // Use Hashset to track characaters in the current window
    // Expand right until we find a duplicate char.
    // When duplicate is found, shrink left until the substring becomes valid


    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


    public static int lengthOfLongest(String s){
        Set<Character> set = new HashSet<>();
        int le = 0, maxlen = 0;
        for (int ri = 0; ri < s.length(); ri++) {
            while (set.contains(s.charAt(ri))) {
                set.remove(s.charAt(le));
                le++;
            }
            set.add(s.charAt(ri));
            maxlen=Math.max(maxlen,ri-le+1);
        }
        return maxlen;
    }
    public static void main(String[] args) {
        Longestsubstring solution = new Longestsubstring();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongest(s));
    }
}
