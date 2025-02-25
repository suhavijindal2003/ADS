

import java.util.Arrays;
import java.util.Stack;

public class circularStack {
     //given an circular array of nteger  we need to find the grestest element for each element
    //if no such element exits return -1

    //input num={1,2,1}
    //output= {2,-1,-1}

    //apporach monotonic stack
    ///a monotonic decresing stack helps effficiently fin ds the next greater element 
    //we use stsck to stack the element that needs greater value 

    //optimized way
    //use a stack:
    //store indices of an element in monotonic decresing order

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1); // Default value if no greater element is found
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < 2 * n; i++) { // Loop twice for circular effect
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n]) {
                result[stack.pop()] = nums[i % n];
            }
            if (i < n) {
                stack.push(i);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {2,8,4,1,2};
        int[] result = nextGreaterElements(nums);
        System.out.println(Arrays.toString(result)); // Output: [2, -1, -1]
    }
}
