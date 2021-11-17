import java.util.*;

class Main {

    public static Stack<Integer> sort(Stack<Integer> stack)
    {
        Stack<Integer> res = new Stack<>();
        while(!stack.isEmpty()){
            int tmp = stack.pop();
            while(!res.isEmpty() && res.peek()>tmp){
                stack.push(res.pop());
            }
            res.push(tmp);

        }
        return res;

    }
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);

        System.out.println(sort(input));
    }
}

