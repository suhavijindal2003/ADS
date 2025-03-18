import java.util.HashMap;
import java.util.Map;
public class subarrayleetcode560 {
    public static int subarray(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int presum=0;
        for(int num:nums){
            presum+=num;
            if(map.containsKey(presum-k)){
                count+=map.get(presum-k);
            }
            map.put(presum,map.getOrDefault(presum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarray(nums,k));
    }
}
