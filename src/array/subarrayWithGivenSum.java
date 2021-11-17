package array;

import java.util.HashMap;

public class subarrayWithGivenSum {

    public int subarrayval(int[] array, int sum){
        int current_sum = array[0];
        int start_index = 0;
        int n = array.length;
        //if current_sum > sum remove last element
        for(int i = 1; i <= n; i++)
        {
            while(current_sum > sum && start_index < i-1)
            {
                current_sum = current_sum - array[start_index];
                start_index++;
            }
            if(current_sum == sum)
            {
                System.out.println("Subarray with given sum is between indexes " + start_index + " and " + (i-1));
                return 1;
            }
            //Add current element to current_sum
            if(i < n)
            {
                current_sum = current_sum + array[i];
            }
        }
        System.out.println("No subarray found with given sum");
        return 0;



    }

    public int subar(int[] arr , int target){
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i =0; i<arr.length; i++){
            sum +=arr[i];
            if(map.containsKey(sum-target)){
                ans+=map.get(sum-target);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return ans;
    }

    public static void main(String[] args) {

        subarrayWithGivenSum s = new subarrayWithGivenSum();
        int[] arr = {1,2,3,7,5};
        int target = 12;
        s.subarrayval(arr,target);
        System.out.println(s.subar(arr,target));
    }
}
