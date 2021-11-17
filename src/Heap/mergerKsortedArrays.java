package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;


class ArrayContainer implements Comparable<ArrayContainer> {
    List<Integer> arr;
    int index;

    public ArrayContainer(List<Integer> arr, int index) {
        this.arr = arr;
        this.index = index;
    }

    @Override
    public int compareTo(ArrayContainer o) {
        return this.arr.get(this.index) - o.arr.get(o.index);
    }
}


public class mergerKsortedArrays {
    public static class  Pair  implements Comparable<Pair>{

        int li;
        int di;
        int value;

        Pair(int li, int di , int value){
            this.li = li;
            this.di = di;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return this.value - o.value;
        }
    }

    public static List<Integer> mergeKSortedArray(List<List<Integer>> arr) {

        PriorityQueue<ArrayContainer> queue = new PriorityQueue<ArrayContainer>();
        int total=0;

        //add arrays to heap
        for (int i = 0; i < arr.size(); i++) {
            queue.add(new ArrayContainer(arr.get(i), 0));
            total = total + arr.get(i).size();
        }

        int m=0;

        List<Integer> res = new ArrayList<>();

        //while heap is not empty
        while(!queue.isEmpty()){
            ArrayContainer ac = queue.poll();

            res.add(m++,ac.arr.get(ac.index));

            if(ac.index < ac.arr.size()-1){
                queue.add(new ArrayContainer(ac.arr, ac.index+1));
            }
        }

        return res;
    }

    public static List<Integer> mergeSortedArray(List<List<Integer>> arr){
        ArrayList<Integer>  rev = new ArrayList<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0 ; i<arr.size(); i++){
            Pair p = new Pair(i,0,arr.get(i).get(0));
            pq.add(p);
        }

        while (pq.size()>0){
            Pair p = pq.remove();
            rev.add(p.value);
            p.di++;

            if(p.di<arr.get(p.li).size()){
                p.value = arr.get(p.li).get(p.di);
                pq.add(p);
            }
        }

        return rev;

    }

    public static void main(String[] args) {
        List<List<Integer>>  ls = new ArrayList<>();
        List<Integer> ls1 = new ArrayList<>();
        ls1.add(1);
        ls1.add(5);
        ls1.add(9);
        ls1.add(11);

        List<Integer> ls2 = new ArrayList<>();
        ls2.add(-1);
        ls2.add(0);

        ls.add(ls1);
        ls.add(ls2);



//        System.out.println(mergeKSortedArray(ls));
        System.out.println(mergeSortedArray(ls));
    }
}
