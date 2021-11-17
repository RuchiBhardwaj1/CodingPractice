package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class maximumArrayK {

    public static ArrayList<Integer> findMax(int[] arr , int k, int n) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();

        int i = 0;

        for (; i < k; i++){
            pq.add(arr[i]);
        }

        res.add(pq.peek());
        pq.remove(arr[0]);

        for(;i<n;i++){
            pq.add(arr[i]);
            res.add(pq.peek());
            pq.remove(arr[i-k+1]);
        }
        return res;


    }

    public static void sliding(int[] arr,int k){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        st.push(arr.length-1);
        nge[arr.length-1] = arr.length;

        for(int i =arr.length-2; i>=0; i--){
            while(st.size()>0 && arr[i]> arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                nge[i]= arr.length;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(i);
        }
        int j =0;
        for(int i =0; i<arr.length-k;i++){
            if(j<i){
                j=i;
            }
            while (nge[j]<i+k){
                j = nge[j];
            }
            System.out.println(arr[j]);
        }


    }

    public static void main(String[] args) {
        int arr[] = { 1,3,-1,-3,5,3,6,7 };
        int k = 3, n = arr.length;
        System.out.println(findMax(arr,k,n));
        sliding(arr,k);
    }

}
