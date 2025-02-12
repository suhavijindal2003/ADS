public class ShortestPalindrome {
    public static void main(String[] args){
        String s="abcd";
        System.out.println(shortpalindrome(s));
    }
    public static String shortpalindrome(String s){
        if(s==null ||s.length()==0){
            return s;
        }
        String t=s+"#"+new StringBuilder(s).reverse().toString();
        int[] lps=clps(t);
        int pallen=lps[t.length()-1];
        String suffixToAdd = s.substring(pallen);
        String result = new StringBuilder(suffixToAdd).reverse().toString() + s;

        return result;
    }
    private  static int[] clps(String s){
        int n=s.length();
        int[] lps=new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            while(j>0 && s.charAt(i)!=s.charAt(j)){
                j=lps[j-1];
            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps;
    }
}
