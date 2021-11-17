package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class kclostestElement {

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
            List<Integer> l=new ArrayList();
            if(arr.length==0)
                return l;
        PriorityQueue<int[]> p=new PriorityQueue<int[]>((a, b)->{
            if(a[0]==b[0])
                return a[1]-b[1];
            else
                return a[0]-b[0];
        });

        for(int i=0;i<arr.length;i++)
        {
            int[] a=new int[]{Math.abs(x-arr[i]),i};
            p.add(a);
        }
        while(k>0)
        {
            int[] b=p.poll();
            l.add(arr[b[1]]);
            k--;
        }
        Collections.sort(l);
        return l;

    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5 };
       int k = 2, x = 3;
        System.out.println(findClosestElements(arr,k,x));

    }
}
