package stack;

import java.util.Arrays;
import java.util.Stack;

public class nextGre {

    public static int[] next(int[] array) {
        // Write your code here.
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[array.length];

        for(int i = array.length - 1; i >= 0; i--){
            if(stack.size() == 0){
                res[i] = -1;
            }
            else if(stack.size()>0 && stack.peek()>array[i]){
                res[i] = stack.peek();
            }
            else if(stack.size()> 0 && stack.peek()<array[i]){
                while(stack.size()>0 && stack.peek()<array[i]){
                    stack.pop();
                }
                if(stack.size()==0){
                    res[i] = -1;
                }
                else{
                    res[i] = stack.peek();
                }
            }
            stack.push(array[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] r = {2,5,-3,-4,6,7,2};
        System.out.println(Arrays.toString(next(r)));
    }
}


