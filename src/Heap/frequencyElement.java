package Heap;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class frequencyElement {

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
         Map<Integer, Integer> mp = new HashMap<>();

         for(int num: nums){
             mp.put(num,mp.getOrDefault(num,0)+1);
         }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> mp.get(b)- mp.get(a));

         for(int x: mp.keySet()){
             pq.add(x);
         }

         for(int i =0; i<k;i++){
             result[i] = pq.poll();
         }
         return result;

    }

    public static void main(String[] args) {
        int[] n = { 1,1,1,1,2,2,3,4};
        int k =2;
        System.out.println(Arrays.toString(topKFrequent(n,k)));
    }
}
