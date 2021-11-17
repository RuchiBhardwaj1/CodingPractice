package recursion;

import java.util.Stack;

public class deleteMiddleElement {

    public static Stack<Integer>  deletemiddle(Stack<Integer> s){
        int y = s.size();
        int u = y/2;
        Stack<Integer> z = new Stack<>();

        for(int i =0 ;i<=u; i++){
            z.push(s.pop());
        }
        z.pop();
        while(!z.isEmpty()){
            s.push(z.pop());
        }
        return s;
    }

    public static  void deleteRecus(Stack<Integer> s, int n , int curr){
        if(s.isEmpty()|| curr== n){
            return;
        }
        int c = s.pop();
        deleteRecus(s,n,curr+1);
        if(curr!=n/2){
            s.push(c);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);



        System.out.println(deletemiddle(s));
        deleteRecus(s,s.size(),0);
    }

}
