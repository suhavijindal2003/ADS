import java.util.*;
class test1{
	public static int longest(int[] arr,int k){
		HashMap<Integer, Integer> hmap=new HashMap<>();
        int sum=0;
		int prefix=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
                prefix=Math.max(prefix, i+1);
            if(!hmap.containsKey(sum))
                hmap.put(sum,i-1);
            if(hmap.containsKey(sum-k))
                prefix=Math.max(prefix, i-hmap.get(sum-k));
        }
        return prefix;
	}
	public static void main(String[] args){
		int[] arr={1,2,3,1,1,1,5,-1};
		int k=5;
		System.out.println(longest(arr,k));
	}
	
}