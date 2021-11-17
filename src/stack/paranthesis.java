package stack;

import java.util.Stack;

public class paranthesis {
    public static boolean isparan(String s){
        Stack<Character>  stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c=='('|| c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                    return false;
                if(c==')'&& stack.peek()!='(')
                    return false;
                if(c==']'&& stack.peek()!='[')
                    return false;
                if(c=='}'&& stack.peek()!='{')
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([}}]";
        System.out.println(isparan(s));
    }
}
