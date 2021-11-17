package stack;

import java.util.Stack;

public class stackMin {
    Stack<Integer> s = new Stack<>();
    Integer minEle;

    public void push(int x) {
        if(s.size()==0){
            s.push(x);
            minEle = x;
        }
        else{
            if(x<minEle){
                s.push(2*x-minEle);
                minEle = x;
            }
        }

    }

    public int pop(){
        if(s.size()==0)
            return -1;
        else{
            if(s.peek()>=minEle)
                s.pop();
            else if(s.peek()<minEle){
                minEle = 2*minEle - s.peek();
                s.pop();
            }
        }
        return s.pop();
    }

}
