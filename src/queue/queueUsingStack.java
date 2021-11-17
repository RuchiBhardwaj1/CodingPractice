package queue;

import java.util.Queue;
import java.util.Stack;

public class queueUsingStack {

    static void interLeaveQueue(Queue<Integer> q)
    {
        // To check the even number of elements
        if (q.size() % 2 != 0)
            return;

        Stack<Integer> s = new Stack<>();
        int n = q.size()/2;
        int i =0;

        while(i!=n){
            s.push(q.poll());
            i++;

        }
        while(!s.isEmpty()){
            q.add(s.peek());
            s.pop();
        }

        for (int j = 0; j < n; j++){
            q.add(q.peek());
            q.poll();
        }

        for (int k = 0; k < n; k++){
            s.push(q.peek());
            q.poll();
        }
        while(!s.isEmpty()){
            q.add(s.peek());
            s.pop();
            q.add(q.peek());
            q.poll();

        }
        System.out.println(q);

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
        interLeaveQueue(q);
    }
}
