package src1;// A Stack based Java program to find next
// greater element for all array elements
// in same order as input.
import java.util.Arrays;
import java.util.Stack;

class NextGreaterElement {

    public static void printNGE(int arr[])
    {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> vector = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (s.size() ==0){
                vector.push(-1);
            }
            else if(s.size()>0 && s.peek()>arr[i]){
                vector.push(s.peek());
            }
            else if(s.size()>0 && s.peek()<arr[i]) {
                while (s.size() > 0 && s.peek() < arr[i]) {
                    s.pop();


                }
                if (s.size() == 0) {
                    vector.push(-1);


                } else {
                    vector.push(s.peek());
                }
            }
            s.push(arr[i]);

            }
        int size = arr.length;
        int[] reverseArray = new int[size];
        for(int i=0; i<size; i++) {
            reverseArray[i] = vector.pop();
        }
        System.out.println("Reversed array is ::"+ Arrays.toString(reverseArray));
        }

    public static void printNGEleft(int arr[])
    {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> vector = new Stack<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (s.size() ==0){
                vector.push(-1);
            }
            else if(s.size()>0 && s.peek()>arr[i]){
                vector.push(s.peek());
            }
            else if(s.size()>0 && s.peek()<=arr[i]) {
                while (s.size() > 0 && s.peek() <= arr[i]) {
                    s.pop();


                }
                if (s.size() == 0) {
                    vector.push(-1);
                } else {
                    vector.push(s.peek());
                }
            }
            s.push(arr[i]);

        }

        System.out.println(vector);
    }
    public static void printNsEL(int arr[])
    {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> vector = new Stack<>();

        for (int i = 0; i < arr.length ; i++)
        {
            if (s.size() ==0){
                vector.push(-1);
            }
            else if(s.size()>0 && s.peek()<arr[i]){
                vector.push(s.peek());
            }
            else if(s.size()>0 && s.peek()>=arr[i]) {
                while (s.size() > 0 && s.peek() >= arr[i]) {
                    s.pop();


                }
                if (s.size() == 0) {
                    vector.push(-1);
                } else {
                    vector.push(s.peek());
                }
            }
            s.push(arr[i]);

        }

        System.out.println(vector);
    }
    public static void printNsER(int arr[])
    {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> vector = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--)
        {
            if (s.size() ==0){
                vector.push(-1);
            }
            else if(s.size()>0 && s.peek()<arr[i]){
                vector.push(s.peek());
            }
            else if(s.size()>0 && s.peek()>=arr[i]){
                while (s.size()>0 && s.peek()>=arr[i])
                {
                    s.pop();
                }
                if(s.size()==0){
                    vector.push(-1);
                }
                else{
                    vector.push(s.peek());
                }

                }

            s.push(arr[i]);

        }
        System.out.println(vector);
    }


    public static void main(String[] args)
    {
        int arr[] = { 11, 13, 21, 3 };
        printNGE(arr);
        printNGEleft(arr);
        printNsEL(arr);
        printNsER(arr);
    }
}
