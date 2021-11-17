package src1;

import javafx.util.Pair;

import java.util.*;

public class frequencyelement {
//    public static int[] topKFrequent(int[] nums, int k) {
//        int[] result = new int[k];
//        Map<Integer, Integer> map = new HashMap<>();
//
//        // Storing the frequency of each number in nums[] in a map
//        for(int num : nums)
//            map.put(num, map.getOrDefault(num, 0) + 1);
//
//        // Initializing a PQ of int[] ordered by highest frequency where -
//        // 0th element of array - key of the map (number in the input array nums)
//        // 1st element of array - value of the map (frequency of a number in the input array)
//        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);
//
//        // Add elements in PQ from the map
//        for(Map.Entry<Integer, Integer> entry: map.entrySet())
//            pq.add(new int[]{entry.getKey(), entry.getValue()});
//
//        // Remove the top K elements from the PQ into the result[]
//        for(int i=0; i < k; i++)
//            result[i] = pq.poll()[0];
//
//        return result;
//    }

    public static int[] topKFrequent(int[] nums, int k) {

        int[] result = new int[k];

        Map<Integer,Integer> mp = new HashMap<>();

        for(int num: nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> mp.get(b)-mp.get(a));

        for(int x: mp.keySet()){
            pq.add(x);
        }

        for(int i = 0; i< k;i++){

            result[i] = pq.poll();
        }
        return result;

    }
    public static void main(String[] args)
    {
        int[] nums = new int[]{1,1,1,2,2,3,3,3,4,4};
        int k =2;
        System.out.println("valeu"+ Arrays.toString(topKFrequent(nums, k)));

    }
}

