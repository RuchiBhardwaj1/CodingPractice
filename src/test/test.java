package test;

import java.util.Arrays;

public class test {

    public int missingNumber(int[] nums){
//        Arrays.sort(nums);
//        int count = 1;
//
//        for(int i =0; i<nums.length; i++){
//            if(nums[i] == count){
//                count = count+1;
//            }
//            else{
//                return count;
//            }
//        }
//        return count;

        int n = nums.length+1;
        int sum = n*(n+1)/2;
        int res=0;
        for(int i =0; i<nums.length;i++){
            res+=nums[i];
        }
        int missingNumber = sum - res;
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,5,4,8,7,9};
        test t = new test();
        System.out.println(t.missingNumber(arr));
    }
}
