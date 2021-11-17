package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class continuousMedian {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;

    /** initialize your data structure here. */
    public continuousMedian() {
        left = new PriorityQueue<>(Collections.reverseOrder()); //max priority Q
        right = new PriorityQueue<>(); //min priority Q

    }

    public void addNum(int val) {
        if(right.size() > 0 && val > right.peek()){
            right.add(val);
        }else{
            left.add(val);
        }
        //balancing elements in both priority q logic

        if(right.size() - left.size() == 2){  //right has more elements
            left.add(right.remove());
        }else if(left.size() - right.size() == 2){
            right.add(left.remove());
        }

    }

    public double findMedian() {
        if(left.size() == right.size()){
            return ((double)left.peek() + (double)right.peek()) / 2;
        }else if(left.size() > right.size()){
            return (double)left.peek();
        }else{                                //right.size() > left.size();
            return (double)right.peek();
        }
    }

    public static void main(String[] args) {

        continuousMedian c = new continuousMedian();

        c.addNum(1);
        c.addNum(2);
        c.addNum(3);
        c.addNum(4);
        c.addNum(5);
        c.addNum(6);
        System.out.println(c.findMedian());

    }

}
