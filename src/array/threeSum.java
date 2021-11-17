package array;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        int target = 0;
//
//        List<List<Integer>> list = new ArrayList<>();
//
//        for(int i = 0; i< nums.length-2 ; i++){
//            int left = i+1;
//            int right = nums.length-1;
//            while(left<right){
//                int currentsum = nums[i]+ nums[left]+nums[right];
//                if(currentsum ==target){
//                    List<Integer> l = Arrays.asList(nums[i], nums[left],nums[right]);
//                    list.add(l);
//                    left++;
//                    right--;
//                }
//                else if(currentsum<target){
//                    left++;
//                }
//                else if(currentsum>target){
//                    right--;
//                }
//
//            }
//        }
//        return list;

        Arrays.sort(nums);
        int n = nums.length;
        if(n<3) return new ArrayList<>();

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i< nums.length-2;i++){
            if(i ==0|| nums[i]!=nums[i-1]){
                int j = i+1, k = n-1;
                while(j<k){
                    int s = nums[i]+nums[j]+nums[k];
                    if(s==0){
                        list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        while(j<k && nums[j] ==nums[j+1]) j++;
                        while(j<k && nums[k]==nums[k-1]) k--;
                        j++;
                        k--;
                    }
                    else if(s>0){
                        k--;
                    }
                    else{
                        j++;
                    }
                }
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[] n = new int[]{12,3,1,2,-6,5,-8,6};
        System.out.println(threeSum(n));
    }
}
