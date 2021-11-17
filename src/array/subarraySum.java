package array;

import java.util.HashMap;

public class subarraySum {
    public static int subarrayyuy(int[] nums, int k) {
        int n = nums.length;

        //Approach
        //a. store the occurrenace of cumulative sum
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1);

        int count = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            //cumulative sum
            //append current number
            sum += nums[i];

            //check sum - k, exists or not
            //if exist it means, it has subarray exits with sum k including current number
            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            //save occurrence of sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1};

        System.out.println(subarrayyuy(arr,2));
    }
}
