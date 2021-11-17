package src1;

import java.util.Stack;

public class minelement {
    Stack<Integer> s = new Stack<>();
    Integer minEle;


    void push(Integer x){
        if (s.size()==0){
            s.push(x);
            minEle= x;
        }
        else{
            if(x<=minEle){
                s.push(2*x-minEle);
                minEle=x;
            }
        }
    }

    int pop(){
        if (s.size()==0){
            return -1;
        }
        else{
            if (s.peek()>=minEle){
                s.pop();
            }
            else if(s.peek()<minEle){
                minEle=2*minEle-s.peek();
                s.pop();
            }
        }
        return 0;
    }

    void top(){
        if (s.size()==0){
            return ;
        }
        else{
            if (s.peek()>=minEle){
                s.peek();
            }
            else if(s.peek()<minEle){
                minEle=2*minEle-s.peek();
            }
        }
    }

    void getMin()
    {
        // Get the minimum number in the entire stack
        if (s.isEmpty())
            System.out.println("Stack is empty");

            // variable minEle stores the minimum element
            // in the stack.
        else
            System.out.println("Minimum Element in the " +
                    " stack is: " + minEle);
    }
    public static void main(String[] args)
    {
        minelement m = new minelement();
        m.push(3);
        m.push(5);
        m.getMin();
        m.push(2);
        m.push(1);
        m.getMin();
        m.pop();
        m.getMin();
        m.pop();
        m.top();
    }

}