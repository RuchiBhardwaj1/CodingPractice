package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        if(nums == null) return nums;;

        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length; j++)
                if(nums[i]+nums[j]==target)
                    return new int[] {i,j};

        }
        return null;

    }

    public static List<int[]> twoSum1(int[] nums, int target) {
        if(nums == null) return null;;

        int i = 0;
        int j = nums.length-1;

        List<int[]> l = new ArrayList<>();

        Arrays.sort(nums);

        while(i<j){
            int sum = nums[i]+nums[j];
            if(sum>target)
                j--;
            else if(sum<target)
                i++;
            else {
                int[] b = new int[]{nums[i], nums[j]};
                l.add(b);
            }
            return l;

        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        if(nums == null) return nums;

        HashMap<Integer,Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length;i++){
        if(map.containsKey(target - nums[i])){
            System.out.println(i+","+ map.get(target-nums[i]));
            return new int[]{i,map.get(target-nums[i])};
        }

        map.put(nums[i],i);

    }
        return new int[]{};

}

    public static void main(String[] args) {
        int[] nums= new int[]{3,2,4,3};
        int target = 6;
        System.out.println(twoSum(nums,target));
        System.out.println(twoSum1(nums,target));
        System.out.println(twoSum2(nums,target));
    }
}