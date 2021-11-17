package array;

public class subarray {

    public static int maxSubArray(int[] nums) {

        int maxsm = nums[0];
        int cuursum = maxsm;
        for(int i =0; i<nums.length; i++){
            cuursum = Math.max(nums[i]+cuursum, nums[i]);
            maxsm= Math.max (cuursum,maxsm);
        }
        return maxsm;

    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }
}
