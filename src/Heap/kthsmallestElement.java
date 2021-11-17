package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class kthsmallestElement {

    public static int kthsmallest(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i = 0; i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }

        return pq.peek();


    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,6,8,9};
        int k = 3;
        System.out.println(kthsmallest(arr,k));
    }
}
