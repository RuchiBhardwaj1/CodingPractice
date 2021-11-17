package array;

import java.util.Stack;

public class paranthesis {

    static boolean findDuplicateparenthesis(String s) {
        // create a stack of characters
        Stack<Character> Stack = new Stack<>();

        // Iterate through the given expression
        char[] str = s.toCharArray();
        for (char ch : str) {
            // if current character is close parenthesis ')'
            if (ch == ')') {
                // pop character from the stack
                char top = Stack.peek();
                Stack.pop();

                // stores the number of characters between a
                // closing and opening parenthesis
                // if this count is less than or equal to 1
                // then the brackets are redundant else not
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            } // push open parenthesis '(', operators and
            // operands to stack
            else {
                Stack.push(ch);
            }
        }

        // No duplicates found
        return false;
    }

    public static boolean hasDuplicateParenthesis(String exp)
    {
        if (exp == null || exp.length() <= 3) {
            return false;
        }

        // take an empty stack of characters
        Stack<Character> stack = new Stack<>();

        // traverse the input expression
        for (char c: exp.toCharArray())
        {
            // if the current char in the expression is not a closing parenthesis
            if (c != ')') {
                stack.push(c);
            }
            // if the current char in the expression is a closing parenthesis
            else {
                // if the stack's top element is an opening parenthesis,
                // the subexpression of the form ((exp)) is found
                if (stack.peek() == '(') {
                    return true;
                }

                // pop till '(' is found for current ')'
                while (stack.peek() != '(') {
                    stack.pop();
                }

                // pop '('
                stack.pop();
            }
        }

        // if we reach here, then the expression does not have any
        // duplicate parenthesis
        return false;
    }

    public static void main(String[] args) {

        // input balanced expression
        String str = "(((a+(b))+(c+d)))";

        if (findDuplicateparenthesis(str)) {
            System.out.println("Duplicate Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }

        hasDuplicateParenthesis(str);

    }
}
