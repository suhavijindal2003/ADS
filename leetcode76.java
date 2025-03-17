import java.util.HashMap;

public class leetcode76 {
     public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0, minStart = 0, minLen = Integer.MAX_VALUE, count = t.length();

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (map.containsKey(c)) {
                if (map.get(c) > 0) count--;  
                map.put(c, map.get(c) - 1);
            }

            while (count == 0) { 
                if (right - left + 1 < minLen) { 
                    minLen = right - left + 1;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);
                    if (map.get(leftChar) > 0) count++; 
                          }

                left++;  
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }

    public static void main(String[] args) {
        leetcode76 solution = new leetcode76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(solution.minWindow(s, t));
    }
}
