package stack;

import java.util.*;

public class nextgreaterelement {
    public static void printNGE(int nums2[], int nums[]){
        Stack<Integer> s = new Stack<>();

        int[] l = new int[nums.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = nums2.length-1; i>=0;i--){
            if(s.size()==0){
                map.put(nums2[i], -1);
            }
            else if(s.size()>0 && s.peek()>nums2[i]){
                map.put(nums2[i],s.peek());
            }
            else if(s.size()>0 && s.peek()<nums2[i]){
                while(s.size()>0 && s.peek()<nums2[i]){
                    s.pop();
                }
                if(s.size()==0){
                    map.put(nums2[i],-1);
                }
                else{
                    map.put(nums2[i],s.peek());
                }
            }
            s.push(nums2[i]);
        }
        System.out.println(map);

        for(int i =0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
                l[i] = map.get(nums[i]);
            }
        }
        System.out.println(Arrays.toString(l));

    }

    public static void main(String[] args) {
        int[] nums2 = {1,2,3,4};
        int[] nums ={2,4};
        printNGE(nums2,nums);
    }
}
