package stack;

import java.util.Stack;

public class sortAStack {

    public static Stack<Integer> sortAstack(Stack<Integer> st){

       Stack<Integer> temp = new Stack<>();
       while(!st.isEmpty()){
           int tem = st.peek();
           st.pop();
           while(!temp.isEmpty() && temp.peek()> tem){
               st.push(temp.peek());
               temp.pop();
           }
           temp.push(tem);
       }
       return temp;

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
//        stack.push(98);
//        stack.push(23);

        System.out.println(sortAstack(stack));

    }
}
