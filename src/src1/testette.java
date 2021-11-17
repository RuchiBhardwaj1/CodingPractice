package src1;

import java.util.Arrays;
import java.util.HashMap;

public class testette {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                return new int[]{i,hm.get(target-nums[i])};
            }
            hm.put(nums[i],i);
        }
        return (new int[]{});

    }

    public static void main(String[] args)
    {
        int arr[] = { 3,2,4};
        int x= 6;

        System.out.println(Arrays.toString(twoSum(arr, x)));

    }
}
