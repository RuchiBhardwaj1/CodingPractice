package array;

public class majorityElement {

    public static int majorityElement(int[] nums) {
        int count = 1;
        int b = nums[0];
        for(int i =1; i< nums.length;i++){
            if(b == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                b = nums[i];
                count =1;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,4};
        System.out.println(majorityElement(nums));


    }
}
