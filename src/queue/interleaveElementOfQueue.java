package queue;

import java.util.LinkedList;
import java.util.Queue;

public class interleaveElementOfQueue {

    public static Queue<Integer> interLeave(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> res = new LinkedList<>();

        int size = q.size();
        int b =0;
        while(b!=size/2){
            q1.add(q.poll());
            b++;
        }

        while(!q1.isEmpty() && !q.isEmpty()){
            res.add(q1.poll());
            res.add(q.poll());
        }

        return res;

    }

    public static void main(String[] args) {

        Queue<Integer> q = new java.util.LinkedList<>();
        q.add(11);
        q.add(12);
        q.add(13);
        q.add(14);
        q.add(15);
        q.add(16);
        q.add(17);
        q.add(18);
        q.add(19);
        q.add(20);
        System.out.println(interLeave(q));
    }
}
