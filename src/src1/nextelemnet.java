package src1;

import java.util.Arrays;
import java.util.Stack;

class nextelemnet {

    public static void printNGE(int nums1[],int arr[])
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
        int size = arr.length;
        int[] reverseArray = new int[size];
        for(int i=0; i<size; i++) {
            reverseArray[i] = vector.pop();
        }
        System.out.println("Reversed array is ::"+ Arrays.toString(reverseArray));
    }
    public static void main(String[] args)
    {
        int arr[] = { 1,3,4,2 };
        int nums1[]={4,1,2};
        printNGE(nums1,arr);

    }
}
