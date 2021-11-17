package src1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class alltest {
    public static ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

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

        int k = 3;
        ArrayList<Integer> obj = new ArrayList<Integer>(
                Arrays.asList(7, 4, 6, 3, 9, 1));

        System.out.println("k'th largest array element is " + solve(obj, k));

    }
}
