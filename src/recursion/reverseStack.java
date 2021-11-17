package recursion;

import java.util.Stack;

public class reverseStack {
    public static void  reverseSta(Stack<Integer> s,int n){
        if(s.size()==0){
            System.out.println(s.pop());
        }

        reverseSta(s,n-1);
        System.out.println();

    }
}
