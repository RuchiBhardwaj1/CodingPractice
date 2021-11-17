package array;

import java.util.Arrays;

public class removeElemenet {
    public static int removeElement(int[] nums, int val) {

        int i =0;
        int j = nums.length;

        while(i<j){
            if(nums[i]==val) {
                nums[i] = nums[j - 1];
                j--;
            }
            else
            {
                i++;
            }

        }
        System.out.println(Arrays.copyOfRange(nums, 0,2));
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums,val));
    }
}
