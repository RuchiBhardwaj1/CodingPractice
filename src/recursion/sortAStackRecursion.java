package recursion;

import java.util.Stack;

public class sortAStackRecursion {
   public static Stack<Integer> sortAstack(Stack<Integer> s){
       if(!s.isEmpty()){
           int x = s.pop();

           sortAstack(s);
           sortedInser(s,x);
       }
       return s;
   }
   public static void sortedInser(Stack<Integer> s, int x){
       if(s.isEmpty()|| x>s.peek()){
           s.push(x);
           return;
       }
       int temp = s.pop();
       sortedInser(s,x);
       s.push(temp);
   }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(13);
        s.push(4);
        s.push(8);
        s.push(20);
        System.out.println(sortAstack(s));
    }

}
