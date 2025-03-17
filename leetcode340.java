import java.util.HashMap;
import java.util.Map;

public class leetcode340{
    //longest substring with at most k distinct characters

    //given a string, find the length of the longest substring T that contains at most k distinct characters
    // public int lengthOfLongestSubstringKDistinct(String s, int k) {
    //     if(s == null || s.length() == 0 || k == 0) return 0;
    //     int[] count = new int[256];
    //     int start = 0, end = 0, maxLen = 0, num = 0;
    //     while(end < s.length()){
    //         if(count[s.charAt(end)] == 0) num++;
    //         count[s.charAt(end)]++;
    //         end++;
    //         while(num > k){
    //             count[s.charAt(start)]--;
    //             if(count[s.charAt(start)] == 0) num--;
    //             start++;
    //         }
    //         maxLen = Math.max(maxLen, end - start);
    //     }
    //     return maxLen;
    // }
    public static int lengthofLongest(String s,int k){
        if(s == null || s.length() == 0 || k == 0) return 0;
        Map<Character, Integer> map = new HashMap<>();
        int le=0,maxlen=0;
        for(int ri=0;ri<s.length();ri++){
            char c=s.charAt(ri);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.size()>k){
                char lc=s.charAt(le);
                map.put(lc,map.get(lc)-1);
                if(map.get(lc)==0) map.remove(lc);
                le++;
            }
            maxlen=Math.max(maxlen,ri-le+1);
        }
        return maxlen;
    }
        public static void main(String[] args){
       
        String s = "eceba";
        int k = 2;
        System.out.println(lengthofLongest(s,k));
    }
}