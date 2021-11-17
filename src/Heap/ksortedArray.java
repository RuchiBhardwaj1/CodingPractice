package Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class ksortedArray {

    public static List<Integer>  ksort(ArrayList<Integer> li , int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        List<Integer> ans= new ArrayList<>();

        for(int i =0; i<li.size(); i++){
            minHeap.add(li.get(i));
            if(minHeap.size()>k){
                ans.add(minHeap.poll());
            }
        }
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll());
        }
        return  ans;


    }

    public static int[]  ksort1(int[] li , int k){

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        List<Integer> ans= new ArrayList<>();
        int s = ans.size();



        for(int i =0; i<li.length; i++){
            minHeap.add(li[i]);
            if(minHeap.size()>k){
                ans.add(minHeap.poll());
            }
        }
        while(!minHeap.isEmpty()){
            ans.add(minHeap.poll());
        }

       int[] ans1 = new int[ans.size()];
        for(int i = 0 ; i<ans1.length; i++ ){
            ans1[i] = ans.get(i);
        }

        return ans1;



    }

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(6);
        li.add(5);
        li.add(3);
        li.add(2);
        li.add(8);
        li.add(10);
        int k =3;

        int[] a= {6,5,3,2,8,10};
        System.out.println(ksort(li,k));
        System.out.println(Arrays.toString(ksort1(a, k)));

    }
}
