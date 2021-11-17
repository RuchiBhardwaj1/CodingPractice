package src1;

import java.util.*;

public class mincostofropes {

//    public static int cost(int[] num) {
//
//        int cost = 0;
//        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
//        for (int i = 0; i < num.length; i++)
//        {
//            minHeap.add(num[i]);
//        }
//        while(minHeap.size() >= 2){
//            int first = minHeap.peek();
//            minHeap.poll();
//            int second = minHeap.peek();
//            minHeap.poll();
//            cost= cost + first+second;
//            minHeap.add(first+second);
//
//
//        }
//        return cost;
//
//    }
//    public static void main(String[] args)
//    {
//        int[] nums = new int[]{1,2,3,4,5};
//        System.out.println("value"+cost(nums));
//
//    }

    public static void KMaxCombinations(int A[], int B[],
                                 int N, int K)
    {
        // max heap.
        PriorityQueue<Integer> pq
                = new PriorityQueue<Integer>(
                Collections.reverseOrder());

        // Insert all the possible
        // combinations in max heap.
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                pq.add(A[i] + B[j]);

        // Pop first N elements
        // from max heap and
        // display them.
        int count = 0;

        while (count < K) {
            System.out.println(pq.peek());
            pq.remove();
            count++;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int A[] = { 4, 2, 5, 1 };
        int B[] = { 8, 0, 5, 3 };
        int N = A.length;
        int K = 3;

        // Function Call
        KMaxCombinations(A, B, N, K);
    }
}


