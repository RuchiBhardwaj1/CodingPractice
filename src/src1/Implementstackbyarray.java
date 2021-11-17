package src1;//class Stack
//{
//    private int arr[];
//    private int top;
//    private int capacity;
//
//    // Constructor to initialize the stack
//    Stack(int size)
//    {
//        arr = new int[size];
//        capacity = size;
//        top = -1;
//    }
//
//    // Utility function to add an element `x` to the stack
//    public void push(int x)
//    {
//        if (isFull())
//        {
//            System.out.println("Overflow\nProgram Terminated\n");
//            System.exit(1);
//        }
//
//        System.out.println("Inserting " + x);
//        arr[++top] = x;
//    }
//
//    // Utility function to pop a top element from the stack
//    public int pop()
//    {
//        // check for stack underflow
//        if (isEmpty())
//        {
//            System.out.println("Underflow\nProgram Terminated");
//            System.exit(1);
//        }
//
//        System.out.println("Removing " + peek());
//
//        // decrease stack size by 1 and (optionally) return the popped element
//        return arr[top--];
//    }
//
//    // Utility function to return the top element of the stack
//    public int peek()
//    {
//        if (!isEmpty()) {
//            return arr[top];
//        }
//        else {
//            System.exit(1);
//        }
//
//        return -1;
//    }
//
//    // Utility function to return the size of the stack
//    public int size() {
//        return top + 1;
//    }
//
//    // Utility function to check if the stack is empty or not
//    public Boolean isEmpty()
//    {
//        return top == -1;               // or return size() == 0;
//    }
//
//    // Utility function to check if the stack is full or not
//    public Boolean isFull() {
//        return top == capacity - 1;     // or return size() == capacity;
//    }
//}
//
//class Main
//{
//    public static void main (String[] args)
//    {
//        Stack stack = new Stack(3);
//
//        stack.push(1);      // inserting 1 in the stack
//        stack.push(2);      // inserting 2 in the stack
//
//        stack.pop();        // removing the top element (2)
//        stack.pop();        // removing the top element (1)
//
//        stack.push(3);      // inserting 3 in the stack
//
//        System.out.println("The top element is " + stack.peek());
//        System.out.println("The stack size is " + stack.size());
//
//        stack.pop();        // removing the top element (3)
//
//        // check if the stack is empty
//        if (stack.isEmpty()) {
//            System.out.println("The stack is empty");
//        }
//        else {
//            System.out.println("The stack is not empty");
//        }
//    }
//}


import java.util.ArrayDeque;
import java.util.Queue;

// Implement stack using two queues
class Stack<T>
{
    Queue<T> q1, q2;

    // Constructor
    public Stack()
    {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    // Insert an item into the stack
    void add(T data)
    {
        // Move all elements from the first queue to the second queue
        while (!q1.isEmpty())
        {
            q2.add(q1.peek());
            q1.poll();
        }

        // Push the given item into the first queue
        q1.add(data);

        // Move all elements back to the first queue from the second queue
        while (!q2.isEmpty())
        {
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // Remove the top item from the stack
    public T poll()
    {
        // if the first queue is empty
        if (q1.isEmpty())
        {
            System.out.println("Underflow!!");
            System.exit(0);
        }

        // return the front item from the first queue
        T front = q1.peek();
        q1.poll();

        return front;
    }
}

class Main
{
    public static void main(String[] args)
    {
        int[] keys = { 1, 2, 3, 4, 5 };

        // insert the above keys into the stack
        Stack<Integer> s = new Stack<Integer>();
        for (int key: keys) {
            s.add(key);
        }

        for (int i = 0; i <= keys.length; i++) {
            System.out.println(s.poll());
        }
    }
}