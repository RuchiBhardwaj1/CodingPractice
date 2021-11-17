package src1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {

    public static int[] isValid(int[] nums1, int[] nums2)
    {
        if(nums1.length==0 || nums2.length==0)
            return new int[]{};
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int n = nums2.length;
        int[] res = new int[nums1.length];
        map.put(nums2[n-1],-1);
        stack.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(stack.size()>0 && nums2[stack.peek()]<=nums2[i])
                stack.pop();
            if(stack.size()==0)
                map.put(nums2[i],-1);
            else
                map.put(nums2[i],nums2[stack.peek()]);
            stack.push(i);
        }
        for(int i=0;i<nums1.length;i++)
            res[i] = map.get(nums1[i]);
        return res;
    }

    public static void main(String[] args)
    {
        int nums1[]={4,1,2};
        int nums2[]={1,3,4,2};
        System.out.printf("result   "+ Arrays.toString(isValid(nums1, nums2)));


    }

}
