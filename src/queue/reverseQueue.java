package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {

    public static Queue<Integer> modifyQueue(Queue<Integer> q, int k)
    {
        //add code here.
        int i =0;
        Stack<Integer> s = new Stack<>();
        Queue<Integer> ans = new LinkedList<>();

        while(i !=k){
            s.push(q.poll());
            i++;
        }

        while(!s.isEmpty()){
            ans.add(s.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.poll());
        }
        return ans;

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int k = 3;
        System.out.println(modifyQueue(q,k));
    }
}
