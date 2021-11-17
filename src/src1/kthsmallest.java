package src1;

import java.util.*;
class Kthsmallest {
    public static int kth(final List<Integer> A, int B) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < A.size(); i++)
        {
            pq.add(A.get(i));
            if (pq.size() > B)
            {
                pq.poll();
            }
        }

        return pq.peek();
    }
    public static ArrayList<Integer> kthlargets(ArrayList<Integer> A, int B){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

//        for (int item : A) {
//            minHeap.add(item);
//        }
//        while (minHeap.size() >0) {
//            System.out.println(minHeap.peek());
//            minHeap.poll();
//
//        }
        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < A.size(); i++)
        {
            minHeap.add(A.get(i));
            if (minHeap.size() > B)
            {
                minHeap.poll();
            }
        }
        ArrayList<Integer> list = new ArrayList<>( minHeap );
        return list;
    }
    public static void main(String[] args)
    {
        List<Integer> A = Arrays.asList(7, 4, 6, 3, 9, 1);
        int k = 3;
        ArrayList<Integer> obj = new ArrayList<Integer>(
                Arrays.asList(7, 4, 6, 3, 9, 1));
        System.out.println("k'th smallest array element is " + kth(A, k));
        System.out.println("k'th largest array element is " + kthlargets(obj, k));

    }
}
