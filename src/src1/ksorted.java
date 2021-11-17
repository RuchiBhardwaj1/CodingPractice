package src1;

import javafx.util.Pair;

import java.util.*;


import java.util.*;

//public class ksorted {
//    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
//
//        ArrayList<Integer> list = new ArrayList<>( maxHeap );
//        for (int i = 0; i < A.size(); i++)
//        {
//            maxHeap.add(A.get(i));
//            if (maxHeap.size() > B)
//            {
//                list.add(maxHeap.peek());
//                maxHeap.poll();
//            }
//        }
//        while(maxHeap.size()>0){
//            list.add(maxHeap.peek());
//            maxHeap.poll();
//        }
//        return list;
//    }
//    public static void main(String[] args)
//    {
//
//        int k = 3;
//        ArrayList<Integer> obj = new ArrayList<Integer>(
//                Arrays.asList(7, 4, 6, 3, 9, 1));
//
//        System.out.println("k'th largest array element is " + solve(obj, k));
//
//    }
//}
import java.util.*;
class Mainy {
    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(target-nums[i]))
            {
                System.out.println(new int[]{i,hm.get(target-nums[i])});
            }
            hm.put(nums[i],i);
        }
        return (new int[]{});
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,8,10, 4,9, 2, 11,5};
        int  target = 7 ;
        twoSum(arr, target);
        System.out.println("Hello, world!");
    }
}