public class leetcode28 {
        public static int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
        }
        public static void main(String[] args) {
           
            System.out.println(strStr("hello", "ll"));  
            System.out.println(strStr("aaaaa", "bba")); 
        }
}
