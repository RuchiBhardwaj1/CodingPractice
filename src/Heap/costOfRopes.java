package Heap;

import java.util.PriorityQueue;

public class costOfRopes {

    public static int cost(int[] arr){
        int sum =0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i =0; i< arr.length;i++){
            pq.add(arr[i]);
        }

        while(pq.size()>=2){
            int first = pq.peek();
            pq.poll();
            int second = pq.peek();
            pq.poll();

            sum= sum+first+second;
            pq.add(first+second);

        }
        return sum;
    }

    public static void main(String[] args) {

        int[] n = {4,3,2,6};
        System.out.println(cost(n));
     }
}


